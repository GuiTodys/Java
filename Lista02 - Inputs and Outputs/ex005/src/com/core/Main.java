package com.core;

import com.services.CentimeterToInchConverter;
import com.services.Printer;
import com.services.Scan;

public class Main {

    public static void main(String[] args) {

        float measureInCentimeters;

        Printer.insertMeasureInCentimetersMessage();
        measureInCentimeters = Scan.scan.nextFloat();

        Printer.informConvertedMeasureToInchesMessage(CentimeterToInchConverter.convertCentimeterToInch(measureInCentimeters));
    }
}
