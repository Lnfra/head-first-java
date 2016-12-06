package com.headfirst.ch4.bethecompiler;

/**
 * Chapter 4, Page 88
 * Source A: Compiles and works fine because java passes by value go() does not modify orig
 */
public class XCopy {
  public static void main(String[] args) {

    int orig = 42;
    XCopy x = new XCopy();
    int y = x.go(orig);
    System.out.println( orig + " " + y );

  }

  int go(int arg) {
    arg = arg * 2;
    return arg;
  }
}
