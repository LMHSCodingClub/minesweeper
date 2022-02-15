package com.lmhscodingclub.minesweeper;

/**
 * Hello world!
 */
public class App {

    /**
     * Says hello to the world.
     * 
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        MinesweeperBoard board = new MinesweeperBoard(10, 12);
        board.generateBoard(20, 0, 0);

        for (int x = 0; x < board.getWidth(); x++) {
            for (int y = 0; y < board.getHeight(); y++) {
                BoardSpace space = board.getBoardSpaceAt(x, y);
                System.out.print(!space.isMine() ? space.getAdjacentMines() : "*");
                System.out.print("|");
            }
            System.out.println();
        }
    }
}
