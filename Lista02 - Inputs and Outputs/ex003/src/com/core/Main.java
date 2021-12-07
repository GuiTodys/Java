package com.core;

import com.services.ConversionCalculator;
import com.services.Printer;
import com.services.Scan;

public class Main {

    public static void main(String[] args) {

        double temperatureInCelsius;

        Printer.informCelsiusTemperatureMessage();
        temperatureInCelsius = Scan.scan.nextDouble();

        Printer.replyTheConvertedTemperature(ConversionCalculator.celsiusToFahrenheitCalculator(temperatureInCelsius));
    }
}
