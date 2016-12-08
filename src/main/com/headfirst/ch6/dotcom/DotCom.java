package com.headfirst.ch6.dotcom;

/**
 * Chapter 6 Page 138
 */
public class DotCom {

  private int[] locationCells;

  private int numOfHits = 0;

  public void setLocationCells(int[] locationCells) {
    this.locationCells = locationCells;
  }

  public String checkYourself(String userGuess) {

    //convert user guess to an int
    int guess = Integer.parseInt(userGuess);
    String result = "miss";

    //compare guess with each cell in the array
    for (int cell : locationCells) {
      if (guess == cell){
        result = "hit";
        numOfHits ++;
        //exit loop as we have found the match
        break;
      }
    }

    //if num of hits is equal to the array length result = kill
    if (numOfHits == locationCells.length) {
      result = "kill";
    }

    System.out.println("result = " + result);
    return result;
  }
}
