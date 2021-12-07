package com.core;

import com.services.Printer;
import com.services.ReaisToDollarConverter;
import com.services.Scan;

public class Main {

    public static void main(String[] args) {
	    float dollarQuotation;
        float amountInReais;

        Printer.insetDollarQuotationMessage();
        dollarQuotation = Scan.scan.nextFloat();

        Printer.insertAmountInReaisMessage();
        amountInReais = Scan.scan.nextFloat();

        Printer.informConvertedAmountToDollars(ReaisToDollarConverter.convertReaisToDollar(dollarQuotation,amountInReais));
    }
}
