package com.headfirst.ch6.dotcom;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Chapter 6 Page 138
 */
public class GameHelper {
  public String getUserInput(String prompt) {
    String inputLine = null;
    System.out.println( prompt + " ");

    try {
      BufferedReader is = new BufferedReader(
        new InputStreamReader(System.in));
      inputLine = is.readLine();
      if (inputLine.length() == 0) return null;

    } catch (Exception e) {
      System.out.println("IO Exception: " + e);
    }
    return inputLine;
  }
}
