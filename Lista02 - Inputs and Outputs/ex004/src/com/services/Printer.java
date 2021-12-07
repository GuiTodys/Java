package com.services;

public class Printer {
    static final String MESSAGE_INFORM_CURRENT_DOLLAR_QUOTATION = "Please, inform the Dollar quotation referred to the present day";
    static final String MESSAGE_INFORM_VALUE_IN_REAIS = "Please, inform the amount in Brazilian Reais";
    static final String MESSAGE_AMOUNT_CONVERTED_TO_DOLLAR = "The inserted amount converted to USD is: ";

    public static void insetDollarQuotationMessage(){
        System.out.println(MESSAGE_INFORM_CURRENT_DOLLAR_QUOTATION);
    }

    public static void insertAmountInReaisMessage(){
        System.out.println(MESSAGE_INFORM_VALUE_IN_REAIS);
    }

    public static void informConvertedAmountToDollars(double amountConvertedToDollars){
        System.out.printf("%s$%.2f", MESSAGE_AMOUNT_CONVERTED_TO_DOLLAR, amountConvertedToDollars);
    }
}
