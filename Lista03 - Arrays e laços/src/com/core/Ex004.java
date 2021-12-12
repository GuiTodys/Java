package com.core;

import com.services.FillNumbersArray;
import com.services.NumbersArrayTools;
import com.services.Printer;

public class Ex004 {
    public static void main(String[] args){

        float[] insertedNumbers = new float[5];
        float highestNumber;
        float lowestNumber;
        float meanValue;

        insertedNumbers = FillNumbersArray.fillNumbersArray(insertedNumbers);

        highestNumber = NumbersArrayTools.findTheHighestNumber(insertedNumbers);
        lowestNumber = NumbersArrayTools.findLowestNumber(insertedNumbers);
        meanValue = NumbersArrayTools.calculateMeanValue(insertedNumbers);

        Printer.informHighestNumber(highestNumber);
        Printer.informLowestNumber(lowestNumber);
        Printer.informMeanValue(meanValue);
    }
}
