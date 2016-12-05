package com.headfirst.ch1.bethecompiler;

/**
 * From Chapter 1, page 21
 * Source code A: File compiles ok, however
 * it will go into an infinite loop due to the conditions.
 */

public class Exercise1b {
  public static void main(String[] args) {

    int x = 1;

    while (x < 10) {
      if (x > 3){
        System.out.println("big x");
      }
    }

  }
}
