package com.core;

import com.services.MultiplicationTableCalculator;
import com.services.Printer;
import com.services.Scan;

public class Exercicio002 {
    public static void main(String[] args){
        int number;

        Printer.printMessageInsertNumber();
        number = Scan.scan.nextInt();

        MultiplicationTableCalculator.multiplicationTable(number);
    }
}
