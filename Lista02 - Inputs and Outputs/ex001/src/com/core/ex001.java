package com.core;

import com.services.MessagesToUser;
import com.services.NumberScanner;

public class ex001 {
    public static void main(String[] args){
    int number1;
    int number2;

        MessagesToUser.printMessageAskingForTheFirstNumber();
        number1 = NumberScanner.scanner.nextInt();

        MessagesToUser.printMessageAskingForTheSecondNumber();
        number2 = NumberScanner.scanner.nextInt();

        System.out.printf("First Number: %d \nSecond number: %d \n", number1, number2);

        MessagesToUser.printSumResult(number1,number2);
        MessagesToUser.printSubtractionResult(number1,number2);
        MessagesToUser.printMultiplicationResult(number1,number2);
        MessagesToUser.printDivisionResult(number1,number2);

    }
}
