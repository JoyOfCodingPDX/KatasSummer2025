package edu.pdx.cs.joy.mob;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TennisTest
{

  @Test
  void canInstantiateKataClass() {
    new Tennis();
  }

  @Test
  void startGameAtLoveAll() {
    Game g = new Game();
    assertThat(g.getP1Score(), equalTo(0));
    assertThat(g.getP2Score(), equalTo(0));
  }

  @Test
  void testToString() {
    Game g = new Game();
    // assertEquals(g.to
  }

  @Test
  void stringGameLoveALL()
  {
    Game g = new Game();
    assertThat(g.toString(), equalTo("Love-All"));
  }

  @Test
  void incrPlayer1Score(){
    Game g = new Game();
    g.P1WinPoint();
    assertThat(g.getP1Score(), equalTo(1));
    assertThat(g.getP2Score(), equalTo(0));
  }

  @Test
  void incrPlayer2Score() {
    Game g = new Game();
    g.P2WinPoint();
    assertThat(g.getP1Score(), equalTo(0));
    assertThat(g.getP2Score(), equalTo(1));
  }

  @Test
  void player1WinsGame_p2ZeroPoints() {
    Game g = new Game();
    g.P1WinPoint();
    g.P1WinPoint();
    g.P1WinPoint();
    g.P1WinPoint();

    assertThat(g.getP1Score(), equalTo(4));
    assertThat(g.checkWinner(), equalTo(1));

  }

  @Test
  void player2WinsGame_p1ZeroPoints() {
    Game g = new Game();
    g.P2WinPoint();
    g.P2WinPoint();
    g.P2WinPoint();
    g.P2WinPoint();

    assertThat(g.getP2Score(), equalTo(4));
    assertThat(g.checkWinner(), equalTo(2));

  }

  @Test
  void noWinner(){
    Game g = new Game();
    assertThat(g.getP1Score(), equalTo(0));
    assertThat(g.getP2Score(), equalTo(0));

    assertThat(g.checkWinner(), equalTo(0));
  }






}
