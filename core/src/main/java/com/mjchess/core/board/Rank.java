package com.mjchess.core.board;

import lombok.Getter;

public enum Rank {
  RANK_1(1),
  RANK_2(2),
  RANK_3(3),
  RANK_4(4),
  RANK_5(5),
  RANK_6(6),
  RANK_7(7),
  RANK_8(8);
 @Getter
  private int number;

  Rank(int number) {

    this.number = number;
  }
}
