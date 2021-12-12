package com.core;

import com.services.EvenAndOddNumbersIdentifier;
import com.services.FillNumbersArray;

public class Ex003 {
    public static void main(String[] args){

        float[] insertedNumbers = new float[5];

        insertedNumbers = FillNumbersArray.fillNumbersArray(insertedNumbers);

        EvenAndOddNumbersIdentifier.identifyEvenAndOddNumbers(insertedNumbers);
    }
}
