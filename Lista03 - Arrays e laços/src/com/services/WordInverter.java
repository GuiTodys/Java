package com.services;

public class WordInverter {
    public static String invertWord(String word){
        char[] wordArray = word.toCharArray();
        String invertedWord = "";

        for(int i=wordArray.length-1; i>=0; i-=1) {
            invertedWord+=wordArray[i];
        }

        return invertedWord;
    }
}
