package com.lmhscodingclub.minesweeper;

public class MinesweeperBoard {
    private boolean shouldSpaceHaveMine() {
        int value = (int)(Math.random()*(5))+1;
        if(value==1)
            return true;
        return false;
    }
}
