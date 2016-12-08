package com.headfirst.ch6.dotcom;

import com.headfirst.ch5.simpledotcom.SimpleDotCom;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by lnfra on 7/12/16.
 */
public class DotComTest {
  com.headfirst.ch5.simpledotcom.SimpleDotCom dot;

  @Before
  public void setUp() throws Exception {
    dot = new SimpleDotCom();
    int[] locations = {2,3,4};
    dot.setLocationCells(locations);
  }

  @Test
  public void TestHitCondition() throws Exception {
    String userGuess = "2";
    String actual = dot.checkYourself(userGuess);
    String expected = "hit";

    assertEquals(expected, actual);
  }

  @Test
  public void TestMissCondition() throws Exception {
    String userGuess = "5";
    String actual = dot.checkYourself(userGuess);
    String expected = "miss";

    assertEquals(expected, actual);
  }

  @Test
  public void TestKillCondition() throws Exception {
    dot.checkYourself("2");
    dot.checkYourself("3");
    String actual = dot.checkYourself("4");
    String expected = "kill";

    assertEquals(expected, actual);

  }
}
