package com.hackbulgaria.programming51.week4;

import java.util.Scanner;
import java.util.Vector;

public class LilisLibrary {
  public static Vector<Pair<String, Integer>> orderBooks(Vector<String> books) {
    return new Vector<Pair<String, Integer>>();
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    Vector<String> books = new Vector<String>();
    int booksCount = Integer.parseInt(scanner.nextLine());

    for (int i = 0; i < booksCount; i++) {
      books.add(scanner.nextLine());
    }

    Vector<Pair<String, Integer>> result = orderBooks(books);

    for(Pair<String, Integer> titleCount: result) {
      System.out.println(titleCount.first + " : " + titleCount.second);
    }
  }
}