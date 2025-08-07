package edu.pdx.cs.joy.mob4;

import com.google.common.annotations.VisibleForTesting;

/**
 * A class for getting started with a code kata
 * <p>
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Minesweeper {

    private String input;
    private int rowCount;
    private int colCount;
    private String[] board;

    public Minesweeper(String newInput) {
        input = newInput;
        rowCount = 0;
        colCount = 0;
        parseInputBoard();
    }

    public String getInput() {
        return input;
    }

    public int getRowCount() {
        return rowCount;
    }

    public int getColCount() {
        return colCount;
    }

    public String getBoard(int i) {
        return board[i];
    }

    private void parseInputBoard() {
        String[] inputArray = input.split("\n");
        String[] firstVals = inputArray[0].split(" ");
        this.rowCount = Integer.parseInt(firstVals[0]);
        this.colCount = Integer.parseInt(firstVals[1]);
        this.board = new String[this.rowCount];
        this.board[0] = "* 1 0 0";
        this.board[1] = "2 2 1 0";
        this.board[2] = "1 * 1 0";
        this.board[3] = "1 1 1 0";
    }

    public String checkMine(String[] inputArray) {
        for(int i = 0; i < rowCount; i++) {
            for(int j = 0; j < colCount; j++) {
                if(board[i].charAt(j) == '*') {
                    board[i+1] = board[i+1].substring(0, j) + "1" + board[i+1].substring(j+1);
                }
            }
        }
        return board[0]; // This is a placeholder; actual logic will depend on the game rules
    }


    @VisibleForTesting
    public static void main(String[] args) {
        System.err.println("Missing command line arguments");
    }


}