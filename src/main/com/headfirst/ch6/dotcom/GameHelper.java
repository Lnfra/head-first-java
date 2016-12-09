package com.headfirst.ch6.dotcom;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Chapter 6 Page 138
 */
public class GameHelper {

  private static final String alphabet = "abcdefg";
  private int gridLength = 7;
  private int gridSize = 49;
  private int[] grid = new int[gridSize];
  private int comCount = 0;


  public String getUserInput(String prompt) {
    String inputLine = null;
    System.out.println( prompt + " ");

    try {
      BufferedReader is = new BufferedReader(
        new InputStreamReader(System.in));
      inputLine = is.readLine();
      if (inputLine.length() == 0) return null;

    } catch (Exception e) {
      System.out.println("IO Exception: " + e);
    }
    return inputLine.toLowerCase();
  }

  public List<String> placeDotCom(int comSize) {

    List<String> alphaCells = new ArrayList<>();

    //holds alphanumeric co-ordinates
    String[] alphaCoords = new String[comSize];
    //temp string for concat
    String temp = null;
    //current candidate coords
    int[] coords = new int[comSize];
    //current attempts counter
    int attempts = 0;
    //flag = found a good location
    boolean success = false;
    //current starting location
    int location = 0;

    //nth dot com to place
    comCount++;
    //set horizontal increment
    int incr = 1;
    //if odd dot com (place vertically)
    if ((comCount%2) == 1) {
      //set vertical increment
      incr = gridLength;
    }

    //main search loop (32)
    while (!success & attempts++ < 200) {
      //get random starting point
      location = (int) (Math.random() * gridSize);
      System.out.println(" try " + location);
      //nth position in dotcom to place
      int x = 0;
      //assume success
      success = true;

      //look for ajacent unused spots
      while (success && x < comSize) {
        //if not already used
        if (grid[location] == 0) {
          //save location
          coords[x++] = location;
          //try next ajacent
          location += incr;

          //out of bounds - bottom
          if (location >= gridSize) {
            success = false;
          }

          //out of bounds - right edge
          if (x>0 && (location % gridLength == 0)) {
            //failure
            success = false;
          }

        }
        else {   //found already used position
          System.out.println(" used " + location);
          //failure
          success = false;
        }
      } // end while
    }

    // turn location into alpha coords
    int x = 0;
    int row = 0;
    int column = 0;
    System.out.println("\n");

    while (x < comSize) {
      //mark master grif pts as used
      grid[coords[x]] = 1;

      //get row value
      row = (int) (coords[x] / gridLength);

      //get numeric column value
      column = coords[x] % gridLength;

      //convert to alpha
      temp = String.valueOf(alphabet.charAt(column));

      alphaCells.add(temp.concat(Integer.toString(row)));
      x++;
      System.out.println(" coord " + x + " = " + alphaCells.get(x - 1));
    }

    System.out.println("/n");
    return alphaCells;

  }
}
