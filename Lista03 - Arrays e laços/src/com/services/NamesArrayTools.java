package com.services;

public class NamesArrayTools {
    public static String findLongestName(String[] nameList){
        String longestName = "";

        for (int i=0;i<nameList.length;i++){
            if(nameList[i].toCharArray().length>longestName.toCharArray().length){
                longestName = nameList[i];
            }
        }
        return longestName;
    }
}
