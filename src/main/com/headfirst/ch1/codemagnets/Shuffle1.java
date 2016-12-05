package com.headfirst.ch1.codemagnets;

/**
 * From Chapter 1, page 20
 */
public class Shuffle1 {
  public static void main(String[] args) {

    //we want to get the output "a-b c-d"
    int x = 3;

    if (x > 2) {
      System.out.print("a");
    }

    while (x > 0) {

      x = x - 1;
      System.out.print("-");

      if (x == 2) {
        System.out.print("b c");
      }
      if (x == 1) {
        System.out.print("d");
        x = x - 1;
      }
    }

  }

}
