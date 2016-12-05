package com.headfirst.ch3.bethecompiler;

/**
 * Chapter 3, page 63
 * Source A: myBooks array was not yet populated with Book objects. Fix: Populate the array before trying to access it.
 */

class Books {
  String title;
  String author;
}

class BooksTestDrive {
  public static void main(String[] args) {

    Books[] myBooks = new Books[3];
    int x = 0;

    myBooks[0] = new Books();
    myBooks[1] = new Books();
    myBooks[2] = new Books();


    myBooks[0].title = "The Grapes of Java";
    myBooks[1].title = "The Java Gatsby";
    myBooks[2].title = "The Java Cookbook";
    myBooks[0].author = "bob";
    myBooks[1].author = "sue";
    myBooks[2].author = "iam";

    while (x < 3){
      System.out.println(myBooks[x].title);
      System.out.println(" by ");
      System.out.println(myBooks[x].author);
      x = x + 1;
    }

  }
}
