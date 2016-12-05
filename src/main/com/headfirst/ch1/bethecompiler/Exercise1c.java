package com.headfirst.ch1.bethecompiler;

/**
 * From Chapter 1, Page 21
 * Source code C: Code will not compile as required to put logic code in main method.
 */
public class Exercise1c {
  int x = 5;

  while( x > 1) {
    x = x-1;

    if (x < 3) {
      System.out.println("small x");
    }
  }
}
