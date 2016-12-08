package com.headfirst.ch6.dotcom;

import java.util.List;

/**
 * Chapter 6 Page 138
 */
public class DotCom {

  private List<Integer> locationCells;

  public void setLocationCells(List<Integer> locationCells) {
      this.locationCells = locationCells;
  }

  public String checkYourself(String userInput) {

    //convert user guess to an int
    int guess = Integer.parseInt(userInput);
    String result = "miss";

    if (locationCells.contains(guess)){
      result = "hit";

      int index = locationCells.indexOf(guess);
      //remove location from array after its been hit
      locationCells.remove(index);
    }

    //if num of hits is equal to the array length result = kill
    if (locationCells.isEmpty()) {
      result = "kill";
    }

    System.out.println("result = " + result);
    return result;
  }
}
