package com.core;

import com.services.Printer;
import com.services.Scanner;
import com.services.StringTools;

public class Ex006 {
    public static void main(String[] args){
        String word = "";
        String invertedAndStylizedWord="";

        Printer.messageInsertWord();
        word = Scanner.scan.nextLine();

        invertedAndStylizedWord = StringTools.invertAndStylishString(word);

        Printer.informInvertedStylizedWord(invertedAndStylizedWord);
    }
}
