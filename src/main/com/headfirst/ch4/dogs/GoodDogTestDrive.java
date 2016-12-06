package com.headfirst.ch4.dogs;

/**
 * Chapter 4, Page 82
 * Accessing GoodDog class with setters as the instance variables are encapsulated
 */
public class GoodDogTestDrive {
  public static void main(String[] args) {
    GoodDog one = new GoodDog();
    one.setSize(70);

    GoodDog two = new GoodDog();
    two.setSize(8);

    System.out.println("Dog one: " + one.getSize());
    System.out.println("Dog two: " + two.getSize());

    one.bark();
    two.bark();
  }
}
