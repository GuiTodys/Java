package com.services;

public class NumbersArrayTools {

    public static float findTheHighestNumber(float[] numbers){

        float highestNumber = numbers[0];

        for (int i=0; i< numbers.length; i++){
            if(highestNumber<numbers[i]){
                highestNumber = numbers[i];
            }
        }

        return highestNumber;
    }

    public static float findLowestNumber(float[] numbers){
        float lowestNumber = numbers[0];

        for (int i=0; i< numbers.length; i++){
            if(lowestNumber>numbers[i]){
                lowestNumber = numbers[i];
            }
        }

        return lowestNumber;
    }

    public static float calculateMeanValue(float[] numbers){

        float sumOfAllElements = 0f;

        for (int i=0;i<numbers.length;i++){
            sumOfAllElements = sumOfAllElements + numbers[i];
        }

        float meanValue = sumOfAllElements/numbers.length;

        return meanValue;
    }

    public static int findOldestPersonIndex(int[] agesArray){

        int oldestPersonIndex = 0;

        for (int i=0; i< agesArray.length; i++){
            if(agesArray[oldestPersonIndex]<agesArray[i]){
                oldestPersonIndex = i;
            }
        }

        return oldestPersonIndex;
    }

    public static int findYoungestPersonIndex(int[] agesArray){
        int youngestPersonIndex = 0;

        for (int i=0; i< agesArray.length; i++){
            if(agesArray[youngestPersonIndex]>agesArray[i]){
                youngestPersonIndex = i;
            }
        }

        return youngestPersonIndex;
    }

    public static float calculateMeanAge(int[] numbers){

        float sumOfAllElements = 0f;

        for (int i=0;i<numbers.length;i++){
            sumOfAllElements = sumOfAllElements + numbers[i];
        }

        float meanValue = sumOfAllElements/numbers.length;

        return meanValue;
    }
}
