package com.headfirst.ch6.dotcom;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Chapter 6 Page 138
 */
public class DotComGame {


  public static void main(String[] args) {

    //declare var to hold num of guesses
    int numOfGusses = 0;

    //class for getting user input
    GameHelper helper = new GameHelper();

    //Create a dot com
    DotCom game = new DotCom();
    //get a random num between 0 and 4 for the starting cell position
    int startPos = (int) (Math.random() * 5);


    /* Set the location of the dot com
     * It is three consecutive cells on a row of 7 cells
     */
    List<Integer> location = new ArrayList<>(Arrays.asList(startPos, startPos + 1, startPos + 2));
    game.setLocationCells(location);

    boolean isAlive = true;

    //while dot com is still alive
    while (isAlive == true ){
      //Prompt user for a guess
      String guess = helper.getUserInput("enter a number");
      String result = game.checkYourself(guess);
      numOfGusses++;

      //Check the guess
      if ( result == "kill"){
        isAlive = false;

        //Inform user how many guesses it took
        System.out.println("You took " + numOfGusses + " gusses");
      }
    }
  }
}
