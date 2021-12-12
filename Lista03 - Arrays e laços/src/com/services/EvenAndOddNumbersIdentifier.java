package com.services;

import java.util.Arrays;

public class EvenAndOddNumbersIdentifier {
    public static void identifyEvenAndOddNumbers(float[] numbersArray){

        float[] evenNumbers = new float[numbersArray.length];
        float[] oddNumbers = new float[numbersArray.length];

        Arrays.fill(evenNumbers,-1);
        Arrays.fill(oddNumbers,-1);

        int evenNumbersIndex = 0;
        int oddNumbersIndex = 0;

        for (int i=0; i<numbersArray.length; i++){
            if (numbersArray[i]%2==0){
                evenNumbers[evenNumbersIndex] = numbersArray[i];
                evenNumbersIndex++;
            } else{
                oddNumbers[oddNumbersIndex] = numbersArray[i];
                oddNumbersIndex++;
            }
        }

        Printer.informOddNumbers(oddNumbers);
        Printer.informEvenNumbers(evenNumbers);

    }
}
