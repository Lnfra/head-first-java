package com.headfirst.ch2.bethecompiler;

/**
 * From Chapter 2, Page 42
 *  Source B: Class could not compile as playDVD method could not be accessed. To fix it created this method.
 */
class DVDPlayer {

  boolean canRecord = false;

  //Added in new method fo dvd playing
  void playDVD() {
    System.out.println("DVD playing");
  }

  void recordDVD(){
    System.out.println("DVD recording");
  }
}

class DVDPlayerTestDrive{
  public static void main(String[] args) {

    DVDPlayer d = new DVDPlayer();
    d.canRecord = true;
    d.playDVD();

    if (d.canRecord){
      d.recordDVD();
    }
  }
}


