package com.headfirst.ch6.dotcom;

import java.util.List;

/**
 * Chapter 6 Page 138
 */
public class DotCom {

  private List<String> locationCells;
  private String name;


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setLocationCells(List<String> locationCells) {
      this.locationCells = locationCells;
  }

  public String checkYourself(String userInput) {

    String result = "miss";
    int index = locationCells.indexOf(userInput);

    if (index >= 0) {
      //remove location from array after its been hit
      locationCells.remove(index);

      //if num of hits is equal to the array length result = kill
      if (locationCells.isEmpty()) {
        result = "kill";
        System.out.println("Ouch! you sunk " + name + " : ( ");
      } else {
        result = "hit";
      }
    }

    return result;
  }
}
