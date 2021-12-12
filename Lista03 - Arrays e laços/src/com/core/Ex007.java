package com.core;

import com.services.NumbersArrayTools;
import com.services.Printer;
import com.services.Scanner;

public class Ex007 {
    public static void main(String[] args){
        String[] names = new String[5];
        int[] ages = new int[5];

        String youngestPerson = "";
        String oldestPerson="";
        float meanAge;

        for (int i=0;i<5;i++){
            Printer.messageInsertNewNameAndAge();
            names[i]=Scanner.scan.next();
            ages[i]=Scanner.scan.nextInt();
        }

        youngestPerson=names[NumbersArrayTools.findYoungestPersonIndex(ages)];
        oldestPerson=names[NumbersArrayTools.findOldestPersonIndex(ages)];
        meanAge = NumbersArrayTools.calculateMeanAge(ages);

        Printer.informYoungestPersonName(youngestPerson);
        Printer.informOldestPersonName(oldestPerson);
        Printer.informAverageAge(meanAge);
    }
}
