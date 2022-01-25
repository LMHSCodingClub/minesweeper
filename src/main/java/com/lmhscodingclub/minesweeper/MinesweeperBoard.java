package com.lmhscodingclub.minesweeper;

public class MinesweeperBoard {
    BoardSpace[][] boardSpaces;
    public MinesweeperBoard(int rows, int columns) {
        boardSpaces = new BoardSpace[rows][columns];
    }

    public void generateBoard(int noMineThisRow, int noMineThisColumn) {
        for(int i=0; i< boardSpaces.length; i++){
            for (int j=0; j< boardSpaces[i].length; j++) {
                if(shouldSpaceHaveMine(5)) {
                    // populate this space with a mine
                    boardSpaces[i][j] = new BoardSpace(-1);
                }
            }
        }
        
        int adjacentMineCount = 0;
        for(int i = 0; i<boardSpaces.length; i++){
            for(int j = 0; j<boardSpaces[i].length; j++){
                if((i - 1) >= 0) {

                    // if((j-1)>=0 && j+1<=length-1)
                }
            }
        }
    }

    

    private boolean shouldSpaceHaveMine(int difficulty) {
        int value = (int)(Math.random()*(difficulty))+1;
        if(value==1)
            return true;
        return false;
    }


    private boolean isSpaceMine(int rowIndex, int columnIndex) {
        return boardSpaces[rowIndex][columnIndex].isMine();
    }
    

    //somewhere...
    // spaces[i].isMine(); 

}
