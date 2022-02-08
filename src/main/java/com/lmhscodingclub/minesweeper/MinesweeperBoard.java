package com.lmhscodingclub.minesweeper;

public class MinesweeperBoard {
    // Our code operates under the assumption that boardSpaces
    // is an array of columns. Index n in boardSpaces will give
    // you the nth column over from the origin. 0 is the leftmost
    // column. Within each column, 0 is the topmost row.
    //
    // Using this system, boardSpaces[x][y] will return the space
    // that is x spaces over and y spaces down. This is similar
    // to a Cartesian coordinate system, except that increasing
    // y values represent lower, not higher, points.
    BoardSpace[][] boardSpaces;

    public MinesweeperBoard(int rows, int columns) {
        boardSpaces = new BoardSpace[rows][columns];
    }

    public void generateBoard(int numberOfMines, int emptyOnThisRow, int emptyOnThisColumn) {
        // First, fill the board with mines. After we populate the board,
        // we can calculate the numbers for the spaces adjacent to the mines.
        for (int i = 0; i < numberOfMines; i++) {
            int x;
            int y;
            do {
                x = (int) Math.random() * (boardSpaces.length);
                y = (int) Math.random() * (boardSpaces[0].length);
            } while (boardSpaces[x][y] != null);

            boardSpaces[x][y] = new BoardSpace(-1);
        }

        int adjacentMineCount = 0;
        for (int i = 0; i < boardSpaces.length; i++) {
            for (int j = 0; j < boardSpaces[i].length; j++) {
                if (spaceHasMine(i - 1, j - 1))
                    adjacentMineCount++;
                if (spaceHasMine(i - 1, j))
                    adjacentMineCount++;
                if (spaceHasMine(i - 1, j + 1))
                    adjacentMineCount++;
                if (spaceHasMine(i, j - 1))
                    adjacentMineCount++;
                if (spaceHasMine(i, j + 1))
                    adjacentMineCount++;
                if (spaceHasMine(i + 1, j - 1))
                    adjacentMineCount++;
                if (spaceHasMine(i + 1, j))
                    adjacentMineCount++;
                if (spaceHasMine(i + 1, j + 1))
                    adjacentMineCount++;
            }
        }
    }

    public BoardSpace getBoardSpaceAt(int x, int y) {
        return boardSpaces[x][y];
    }

    public int getHeight() {
        // Height is the number of rows.
        // Because all of our columns have the same amount of rows (the
        // board is a rectangle), it does not matter which column we select,
        // so select the first one.
        return boardSpaces[0].length;
    }

    public int getWidth() {
        // Width is the number of columns.
        return boardSpaces.length;
    }

    // return whether boardSpaces[x][y] is a mine
    // however, we also make sure that using indices x and y
    // will not raise IndexOutOfBoundsException
    private boolean spaceHasMine(int x, int y) {
        if (x < 0 || x >= boardSpaces.length)
            return false;
        else if (y < 0 || y >= boardSpaces[x].length)
            return false;

        return boardSpaces[x][y].isMine();
    }
}
