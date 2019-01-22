package com.mjchess.core.board;

import lombok.Getter;

public enum File {
  FILE_a('a'),
  FILE_b('b'),
  FILE_c('c'),
  FILE_d('d'),
  FILE_e('e'),
  FILE_f('f'),
  FILE_g('g'),
  FILE_h('h');

  @Getter
  private char fileChar;

  File(char fileChar) {

    this.fileChar = fileChar;
  }
}
