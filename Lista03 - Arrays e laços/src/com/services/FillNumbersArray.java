package com.services;

public class FillNumbersArray {

    public static float[] fillNumbersArray(float[] numbersArray){

        float[] numbersArrayInProgress = new float[numbersArray.length];

        for(int i=0;i<numbersArray.length;i+=1) {
            Printer.messageInsertNumber(i);
            numbersArrayInProgress[i] = Scanner.scan.nextFloat();
        }

        return numbersArrayInProgress;
    }

}
