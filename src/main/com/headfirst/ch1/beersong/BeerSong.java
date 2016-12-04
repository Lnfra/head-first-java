package com.headfirst.ch1.beersong;

//From Chapter 1, page 14
public class BeerSong {

    public static void main( String[] args){

        int numOfBottles = 99;
        while( numOfBottles > -1){
          System.out.println( printLyrics( numOfBottles) );
          numOfBottles--;
        }
    }


  public static String printLyrics(int bottles ){
      if( bottles > 1){
        return bottles + " bottles of beer on the wall, " + bottles + " bottles of beer.\n" +
        "Take one down and pass it around, " + (bottles - 1) + " bottles of beer on the wall.";
      }
      else if (bottles == 1 ) {
        return bottles + " bottle of beer on the wall, " + bottles + " bottle of beer.\n" +
        "Take one down and pass it around, no more bottles of beer on the wall.";
      }
      else {
        return "No more bottles of beer on the wall, no more bottles of beer.\n" +
        "Go to the store and buy some more, 99 bottles of beer on the wall.";
      }
  }

}
