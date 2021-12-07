package com.services;

public class Printer {
    static final String MESSAGE_INSERT_MEASURE_IN_CENTIMETER = "Please, insert the measure in centimeters";
    static final String MESSAGE_INFORM_THE_CONVERTED_MEASURE_TO_INCHES = "The measure converted to inches is equal to: ";

    public static void insertMeasureInCentimetersMessage(){
        System.out.println(MESSAGE_INSERT_MEASURE_IN_CENTIMETER);
    }

    public static void informConvertedMeasureToInchesMessage(float convertedMeasureToInches){
        System.out.printf("%s%.2f in", MESSAGE_INFORM_THE_CONVERTED_MEASURE_TO_INCHES, convertedMeasureToInches);
    }

}
