package com.services;

public class MessagesToUser {

    final static String MESSAGE_ASKING_FOR_FIRST_NUMBER = "Please, insert the first number";
    final static String MESSAGE_ASKING_FOR_SECOND_NUMBER = "Please, insert the second number";

    public static void printMessageAskingForTheFirstNumber(){
        System.out.println(MESSAGE_ASKING_FOR_FIRST_NUMBER);
    }

    public static void printMessageAskingForTheSecondNumber(){
        System.out.println(MESSAGE_ASKING_FOR_SECOND_NUMBER);
    }

    public static void printSumResult(int number1, int number2){
        System.out.printf("The resulting sum of the inserted numbers is: %d \n", Calculator.sum(number1,number2));
    }

    public static void printSubtractionResult(int number1, int number2){
        System.out.printf("The resulting subtraction of the inserted numbers is: %d \n", Calculator.subtract(number1,number2));
    }

    public static void printMultiplicationResult(int number1, int number2){
        System.out.printf("The resulting multiplication of the inserted numbers is: %d \n", Calculator.muliply(number1,number2));
    }

    public static void printDivisionResult(int number1, int number2){
        System.out.printf("The resulting division of the inserted numbers is: %.2f \n", Calculator.divide(number1,number2));
    }

}
