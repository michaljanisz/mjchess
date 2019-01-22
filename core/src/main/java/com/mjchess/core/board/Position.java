package com.mjchess.core.board;


import java.util.HashMap;
import java.util.Map;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode
@AllArgsConstructor
public class Position {
  private Rank rank;
  private File file;

  private static Map<String, Position> allPositions = initAllPositionMap();

  private static Map<String, Position> initAllPositionMap() {
    Map<String, Position> result = new HashMap<>();
    for (File file : File.values()) {
      for (Rank rank : Rank.values()) {
        result.put(getFileRankString(file, rank),
            new Position(rank, file));
      }

    }
    return result;
  }

  private static String getFileRankString(File file, Rank rank) {
    return new StringBuilder().append(file.getFileChar()).append(rank.getNumber()).toString();
  }

  public static Position of(String postionString){

      if (!allPositions.containsKey(postionString)){
        throw new IllegalArgumentException("Unknown position string "+postionString);
      }
      return allPositions.get(postionString);
  }
}