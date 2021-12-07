package com.services;

public class Printer {

    static final String MESSAGE_INFORM_CELSIUS_TEMPERATURE = "Please, inform the temperature in ºC \n";
    static final String MESSAGE_REPLY_THE_CONVERTED_TEMPERATURE = "The temperature converted to ºF is: ";

    public static void informCelsiusTemperatureMessage(){
        System.out.printf(MESSAGE_INFORM_CELSIUS_TEMPERATURE);
    }

    public static void replyTheConvertedTemperature(double temperatureInCelsius){
        System.out.printf("%s%.2f", MESSAGE_REPLY_THE_CONVERTED_TEMPERATURE,temperatureInCelsius);
    }

}
