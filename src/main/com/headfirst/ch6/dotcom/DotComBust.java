package com.headfirst.ch6.dotcom;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * From Chapter 6 page 144
 */
public class DotComBust {

  GameHelper helper = new GameHelper();
  List<DotCom> dotComList = new ArrayList<>();
  int numOfGuesses = 0;

  public static void main(String[] args) {
    DotComBust game = new DotComBust();
    game.setUpGame();
    game.startPlaying();

  }

  //Create and init DotCom objects with names and locations
  //Display brief instructions to user
  void setUpGame() {
    DotCom dot1 = new DotCom();
    dot1.setName("Pets.com");
    dotComList.add(dot1);

    DotCom dot2 = new DotCom();
    dot2.setName("eToys.com");
    dotComList.add(dot2);

    DotCom dot3 = new DotCom();
    dot3.setName("Go2.com");
    dotComList.add(dot3);

    System.out.println("Your goal is to sink three dot coms.");
    System.out.println("Pets.com, eToys.com, Go2.com");
    System.out.println("Try to sink them all in the fewest number of guesses");

    for (DotCom dotCom : dotComList) {
      dotCom.setLocationCells(helper.placeDotCom(3));
    }

  }

  //Asks the player for guesses and calls the checkUserGuess method
  //until all DotComs are removed from play
  void startPlaying() {
    while (!dotComList.isEmpty()) {
      String input = helper.getUserInput("Enter a guess");
      checkUserGuess(input);
    }
    finishGame();
  }

  //Loops through all remaining DotComs
  // and calls each DOtCom's checkYourself method
  void checkUserGuess(String userGuess) {

    //Init the result to default miss
    String result = "miss";

    //increment the user guesses count
    numOfGuesses++;

    Iterator<DotCom> i = dotComList.iterator();
    while (i.hasNext()){
      DotCom dotCom = i.next();
      result = dotCom.checkYourself(userGuess);

      if (result == "hit"){
        System.out.println("Hit " + dotCom.getName());
        break;
      }

      if (result == "kill"){
        //remove the dotCom from list after its is killed
        i.remove();
        System.out.println("Killed " + dotCom.getName() + " , removing from list.");
        break;
      }
    }

  }

  //Prints a message about user performance based on how many guesses it took to sink
  // all the DotCom objects.
  void finishGame() {

    System.out.println("Game ended, all dotComs are killed. Your stock is now worthless.");
    if (numOfGuesses < 18){
      System.out.println("Congratulations! Number of guesses: " + numOfGuesses);
    }
    else {
      System.out.println("Took long enough! Number of guesses: " + numOfGuesses);
    }

  }
}
