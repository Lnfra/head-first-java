package com.headfirst.ch5.simpledotcom;

/**
 * Chapter 5 Page 107
 */
public class SimpleDotComGame {


  public static void main(String[] args) {

    //declare var to hold num of guesses
    int numOfGusses = 0;

    //class for getting user input
    GameHelper helper = new GameHelper();

    //Create a dot com
    SimpleDotCom game = new SimpleDotCom();
    //get a random num between 0 and 4 for the starting cell position
    int startPos = (int) (Math.random() * 5);


    /* Set the location of the dot com
     * It is three consecutive cells on a row of 7 cells
     */
    int[] location = {startPos, startPos + 1, startPos + 2};
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
