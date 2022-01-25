package com.lmhscodingclub.minesweeper;

// [BoardSpace] [BoardSpace] [BoardSpace]
// [BoardSpace] [BoardSpace] [BoardSpace]
// [BoardSpace] [BoardSpace] [BoardSpace]

// etc.


public class BoardSpace {
    int adjacentMines;

    // If adjacentMines is -1, 
    // consider this board space a mine
    public BoardSpace(int adjacentMines) {
        this.adjacentMines = adjacentMines;
    }

    public boolean isMine() {
        return adjacentMines == -1;
    }

    public int getAdjacentMines(){
        return adjacentMines;
    }
    
}
