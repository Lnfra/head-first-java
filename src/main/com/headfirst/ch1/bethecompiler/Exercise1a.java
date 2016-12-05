package com.headfirst.ch1.bethecompiler;

/**
 * From Chapter 1, Page 21
 * Source Code A: Below code will not compile as it is missing its class declaration
 * To fix it enclose it with public class Exercise1a{ }
 */

  public static void main(String[]args){
    int x = 5;

    while( x > 1) {
      x = x-1;

      if(x < 3){
        System.out.println("small x");
      }
    }
  }
