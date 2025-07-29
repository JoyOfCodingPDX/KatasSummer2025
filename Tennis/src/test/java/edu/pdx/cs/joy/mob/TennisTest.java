package edu.pdx.cs.joy.mob;

import org.junit.jupiter.api.Test;

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
    assertEquals(g.getP1Score(), 0);
    assertEquals(g.getP2Score(), 0);
  }

  @Test
  void testToString() {
    Game g = new Game();
    // assertEquals(g.to
  }

}
