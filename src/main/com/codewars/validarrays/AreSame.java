package com.codewars.validarrays;

import java.util.Arrays;

public class AreSame {


  public static boolean comp(int[] a, int[] b) {

    if (a == null || b == null) {
      return false;
    } else if (a.length != b.length ) {
      return false;
    }

    Arrays.sort(a);
    Arrays.sort(b);

    //square the nums and store in temp
    for (int i = 0; i < a.length; i++) {
      if (a[i] * a[i] != b[i]){
        return false;
      }
    }

    return true;
  }
}
