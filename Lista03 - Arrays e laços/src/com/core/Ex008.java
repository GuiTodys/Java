package com.core;

import com.services.IMCCalculationAndAnalysis;
import com.services.Printer;
import com.services.Scanner;

public class Ex008 {
    public static void main(String[] args){
        String[] names = new String[5];
        float[] height = new float[5];
        float[] weight = new float[5];
        float[] IMCValues = new float[5];


        for (int i=0;i<5;i++){
            Printer.messageInsertNewNamHeightAndWeight();
            names[i]= Scanner.scan.next();
            height[i]=Scanner.scan.nextFloat();
            weight[i]=Scanner.scan.nextFloat();
        }

        IMCValues= IMCCalculationAndAnalysis.calculateIMC(height,weight);
        IMCCalculationAndAnalysis.evaluateIMCValues(names,IMCValues);

    }
}
