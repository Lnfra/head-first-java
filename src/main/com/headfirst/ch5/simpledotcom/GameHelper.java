package com.headfirst.ch5.simpledotcom;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by lnfra on 8/12/16.
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
