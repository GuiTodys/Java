package com.core;

import com.services.NameListCreator;
import com.services.NamesArrayTools;
import com.services.Printer;

public class Ex005 {
    public static void main(String[] args){
     String[] nameList = new String[5];
     String longestName = "";

        nameList = NameListCreator.createNameList(nameList);

        longestName = NamesArrayTools.findLongestName(nameList);

        Printer.informLongestName(longestName);
    }
}
