package com.headfirst.ch4.dogs;

/**
 * Chapter 4, Page 82
 * Dog class but with the instance variables encapsulated
 */
public class GoodDog {
  private int size;

  public int getSize() {
    return size;
  }

  public void setSize(int size) {
    this.size = size;
  }

  void bark() {
    if (size > 60) {
      System.out.println("Wooof! Wooof!");
    }
    else if (size > 14) {
      System.out.println("Ruff! Ruff!");
    }
    else {
      System.out.println("Yip! Yip!");
    }
  }
}
