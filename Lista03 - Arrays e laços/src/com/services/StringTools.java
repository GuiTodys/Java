package com.services;

public class StringTools {
    public static String invertAndStylishString(String word){
        String invertedAndStylizedWord = "";
        char[] wordCharArray = word.toCharArray();

        for (int i=0;i<wordCharArray.length;i++){
            if(i%2==0) {
                invertedAndStylizedWord += Character.toUpperCase(wordCharArray[i]);
            } else{
                invertedAndStylizedWord += wordCharArray[i];
            }
            }
        return invertedAndStylizedWord;
        }
    }

