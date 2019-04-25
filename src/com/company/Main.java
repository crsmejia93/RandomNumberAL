package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        int randNum;
        ArrayList<String> books = new ArrayList<>();
        books.add("Book 1");
        books.add("Book 2");
        books.add("Book 3");
        books.add("Book 4");
        books.add("Book 5");
        books.add("Book 6");
        books.add("Book 7");
        books.add("Book 8");
        books.add("Book 9");
        books.add("Book 10");

        randNum = (int)(1+(Math.random()*books.size()));

        System.out.println(books.get(randNum));

    }
}
