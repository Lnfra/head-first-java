package com.headfirst.ch1.beersong;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by lnfra on 5/12/16.
 */
public class BeerSongTest {

    BeerSong beerSong;

    @Before
    public void setUp() throws Exception {
        beerSong = new BeerSong();
    }

    @Test
    public void testPrintLyricsFor99Bottles() {
        int numOfBottles = 99;
        String message = generateLyric99To2(numOfBottles);
        assertEquals(message, beerSong.printLyrics( numOfBottles ));
    }
    @Test
    public void testPrintLyricsFor2Bottles() {
        int numOfBottles = 2;
        String message = generateLyric99To2(numOfBottles);
        assertEquals(message, beerSong.printLyrics( numOfBottles ));
    }
    @Test
    public void testPrintLyricsFor1Bottle() {
        int numOfBottles = 1;
        String message = "1 bottle of beer on the wall, 1 bottle of beer.\n" +
                "Take one down and pass it around, no more bottles of beer on the wall.";
        assertEquals(message, beerSong.printLyrics( numOfBottles ));
    }
    @Test
    public void testPrintLyricsFor0Bottles() {
        int numOfBottles = 0;
        String message = "No more bottles of beer on the wall, no more bottles of beer.\n" +
                "Go to the store and buy some more, 99 bottles of beer on the wall.";
        assertEquals(message, beerSong.printLyrics( numOfBottles ));
    }

    private String generateLyric99To2( int bottles){
        return bottles + " bottles of beer on the wall, " + bottles + " bottles of beer.\n" +
                "Take one down and pass it around, " + (bottles - 1) + " bottles of beer on the wall.";
    }

}