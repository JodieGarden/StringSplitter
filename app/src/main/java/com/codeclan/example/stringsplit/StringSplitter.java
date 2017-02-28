package com.codeclan.example.stringsplit;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by user on 27/02/2017.
 */

public class StringSplitter {

    private String input;


    private String[] words;


    public StringSplitter() {

    }

    public StringSplitter(String s) {
    }

    public void setInput(String input) {
        this.input = input;
    }

    public String[] getWords() {
        return words;
    }

    public int splitString(String input) {

        words = input.split("['\\s]+");
        return words.length;
//        String[] words = input.split("[,\\s+]");
//        for (String s : words) {
//            System.out.println(s);
//        }
//        System.out.println("Number of words: " + words.length);
//        return words.length;
    }

}




