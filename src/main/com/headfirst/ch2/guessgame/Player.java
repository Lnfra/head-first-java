package com.headfirst.ch2.guessgame;

/**
 * From Chapter 2, pg 39
 */
public class Player {
  int number = 0;

  public void guess(){
    number = (int) (Math.random() * 10);
    System.out.println("I'm guessing " + number);
  }
}
