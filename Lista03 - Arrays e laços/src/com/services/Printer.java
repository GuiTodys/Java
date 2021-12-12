package com.services;

import com.core.Ex002;
import com.sun.jdi.PrimitiveValue;

public class Printer {
//    Ex001 Attributes
    private static final String MESSAGE_INSERT_NEW_LIST_ITEM = "Please, insert 5 list items to complete the list. Total items inserted: ";
    private static final String MESSAGE_INFORM_COMPLETED_LIST = "The list items are:";
//    Ex002 Attributes
    private static final String MESSAGE_INSERT_WORD = "Please, insert a word";
    private static final String MESSAGE_INFORM_INVERTED_DWORD = "The word inverted is: ";
//    Ex003 Attributes
    private static final String MESSAGE_INSERT_NUMBER = "Please, insert 5 numbers to complete the list. Numbers inserted: ";
    private static final String INFORM_EVEN_NUMBERS = "Even Numbers: ";
    private static final String INFORM_ODD_NUMBERS = "Odd numbers: ";
//    Ex004 Attributes
    private static final String INFORM_HIGHEST_NUMBER = "The highest number in the array is: ";
    private static final String INFORM_LOWEST_NUMBER = "The lowest number in the array is: ";
    private static final String INFORM_MEAN_VALUE = "The mean value is: ";
//      Ex005 Attributes
    private static final String MESSAGE_INSERT_NEW_NAME = "Please, insert 5 names to complete the list. Total names inserted: ";
    private static final String INFORM_LONGEST_NAME = "The longest name in the list is: ";
//    Ex006 Attributes
    private static final String MESSAGE_INFORM_INVERTED_AND_STYLIZED_WORD = "The resulting word is: ";
//    Ex007 Attributes
    private static final String MESSAGE_INSERT_NEW_NAME_AND_AGE = "Please, insert the person's name and age respectively: ";
    private static final String INFORM_OLDEST_PERSON = "The oldest person is: ";
    private static final String INFORM_YOUNGEST_PERSON = "The youngest person is:";
    private static final String INFORM_AVERAGE_AGE = "The average age is: ";
//    Ex008 Attributes
    private static final String MESSAGE_INSERT_NEW_NAME_HEIGHT_AND_WEIGHT = "Please, insert the person's name, height[m] and weight[kg] respectively: ";


//    Ex001 Methods
    public static void messageInsertNewListItem(int listLength){
        System.out.printf("%s%d\n", MESSAGE_INSERT_NEW_LIST_ITEM, listLength);
    }

    public static void informCompletedListHeaderMessage(){
        System.out.println(MESSAGE_INFORM_COMPLETED_LIST);
    }

    public static void informCompletedListData(String[] completedList){
        for (int i=0;i<completedList.length;i+=1){
            System.out.println(completedList[i]);
        }
    }

//    Ex002 Methods
    public static void messageInsertWord(){
        System.out.println(MESSAGE_INSERT_WORD);
    }

    public static void informInvertedWord(String invertedWord){
        System.out.printf("%s%s", MESSAGE_INFORM_INVERTED_DWORD, invertedWord);
    }

//    Ex003 Methods
    public static void messageInsertNumber(int numberOfInsertedNumbers){
        System.out.printf("%s%d\n", MESSAGE_INSERT_NUMBER, numberOfInsertedNumbers);
    }
    public static void informEvenNumbers(float[] evenNumbersArray){
        System.out.println(INFORM_EVEN_NUMBERS);
        for (int i=0; i<evenNumbersArray.length; i++){
            if (evenNumbersArray[i]!=-1) {
                System.out.printf("%.2f ", evenNumbersArray[i]);
            }
        }
        System.out.println("\n");
    }
    public static void informOddNumbers(float[] oddNumbersArray){
        System.out.println(INFORM_ODD_NUMBERS);
        for (int i=0; i<oddNumbersArray.length; i++){
            if(oddNumbersArray[i]!=-1) {
                System.out.printf("%.2f ", oddNumbersArray[i]);
            }
        }
        System.out.println("\n");
    }

//    Ex004 Methods
    public static void informHighestNumber(float highestNumber){
        System.out.printf("%s%.2f\n", INFORM_HIGHEST_NUMBER, highestNumber);
    }

    public static void informLowestNumber(float lowestNumber){
        System.out.printf("%s%.2f\n", INFORM_LOWEST_NUMBER, lowestNumber);
    }

    public static void informMeanValue(float meanValue){
        System.out.printf("%s%.2f\n", INFORM_MEAN_VALUE, meanValue);
    }

//    Ex005 Methods
    public static void messageInsertNewName(int numberOfInsertedNames){
        System.out.printf("%s%d%n", MESSAGE_INSERT_NEW_NAME, numberOfInsertedNames);
    }

    public static void informLongestName(String longestName){
        System.out.printf("%s%s\n", INFORM_LONGEST_NAME, longestName);
    }
//    Ex006 Methods
    public static void informInvertedStylizedWord(String stylezedWord){
        System.out.printf("%s%s\n", MESSAGE_INFORM_INVERTED_AND_STYLIZED_WORD, stylezedWord);
    }

//    Ex007 Methods
    public static void messageInsertNewNameAndAge(){
        System.out.printf("%s\n", MESSAGE_INSERT_NEW_NAME_AND_AGE);
    }
    public static void informYoungestPersonName(String youngestPersonName){
        System.out.printf("%s%s\n", INFORM_YOUNGEST_PERSON, youngestPersonName);
    }
    public static void informOldestPersonName(String oldestPersonName){
        System.out.printf("%s%s\n", INFORM_OLDEST_PERSON, oldestPersonName);
    }
    public static void informAverageAge(float agesMeanValue){
        System.out.printf("%s%.2f\n", INFORM_AVERAGE_AGE, agesMeanValue);
    }

//    Ex008 Methods
    public static void messageInsertNewNamHeightAndWeight(){
        System.out.printf("%s\n", MESSAGE_INSERT_NEW_NAME_HEIGHT_AND_WEIGHT);
    }


}
