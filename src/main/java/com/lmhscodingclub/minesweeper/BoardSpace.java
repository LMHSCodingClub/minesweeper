package com.lmhscodingclub.minesweeper;

public class BoardSpace {
    int touchingNumber;

    public BoardSpace(boolean hasMine) {

    }

    public BoardSpace(int value) {
        touchingNumber = value;
    }
}
