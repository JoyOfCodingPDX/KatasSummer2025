package edu.pdx.cs.joy.mob4;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class MinesweeperTest
{

  // @Test
  // void canInstantiateKataClass() {
  //   new Minesweeper();
  // }

  @Test
  void takeInputAsString() {
    String input = "4 4\n" +
            "*...\n" +
            "....\n" +
            ".*..\n" +
            "....";
    Minesweeper game = new Minesweeper(input);
    assertThat(input, equalTo(game.getInput()));
    // String[] output = game.printOutput();
    // String[] testResult = {"Field #1:"
    //         *100
    //         2210
    //         1*10
    //         1110
  }

  @Test
  void parseFirstLine() {
    String input = "4 4\n" +
            "*...\n" +
            "....\n" +
            ".*..\n" +
            "....";
    Minesweeper game = new Minesweeper(input);
    assertThat(game.getRowCount(), equalTo(4));
    assertThat(game.getColCount(), equalTo(4));
  }

//  @Test
//  void checkForMines(){
//
//  }

}
