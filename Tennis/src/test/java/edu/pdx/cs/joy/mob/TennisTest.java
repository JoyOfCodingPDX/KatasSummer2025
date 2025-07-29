package edu.pdx.cs.joy.mob;

import org.hamcrest.MatcherAssert;
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
    g.P1Win();
    assertThat(g.getP1Score(), equalTo(1));
    assertThat(g.getP2Score(), equalTo(0));
  }

  @Test
  void incrPlayer2Score() {
    Game g = new Game();
    g.P2Win();
    assertThat(g.getP1Score(), equalTo(0));
    assertThat(g.getP2Score(), equalTo(1));
  }

  @Test
  void player1WinsGame() {
    Game g = new Game();
    g.P1Win();
    g.P1Win();
    g.P1Win();
    g.P1Win();

    assertThat(g.getP1Score(), equalTo(4));

  }




}
