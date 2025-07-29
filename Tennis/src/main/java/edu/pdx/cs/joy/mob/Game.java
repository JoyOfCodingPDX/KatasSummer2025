package edu.pdx.cs.joy.mob;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Game {

  private int p1Score = 0;
  private int p2Score = 0;

  public int getP1Score() {
    return p1Score;
  }

  public int getP2Score() {
    return p2Score;
  }

  @Override
    public String toString() {
      return "Love-All";
    }

  public void P1WinPoint() {
    ++p1Score;
  }

  public void P2WinPoint() {
    ++p2Score;
  }

public int getWinner(){
    if(p1Score == 4){
      return 1;
    }
    throw new UnsupportedOperationException("P1 won't be the winner");
}



}