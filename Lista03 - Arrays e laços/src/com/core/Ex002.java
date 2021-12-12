package com.core;

import com.services.Printer;
import com.services.Scanner;
import com.services.WordInverter;

public class Ex002 {
    public static void main(String[] args){

        String givenWord;
        String invertedWord;

        Printer.messageInsertWord();
        givenWord = Scanner.scan.nextLine();

        invertedWord = WordInverter.invertWord(givenWord);
        Printer.informInvertedWord(invertedWord);


    }
}
