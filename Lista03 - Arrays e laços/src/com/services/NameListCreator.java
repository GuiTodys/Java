package com.services;

public class NameListCreator {
    public static String[] createNameList(String[] nameListTemplate) {
        String[] listInProgress = new String[nameListTemplate.length];

        for (int i = 0; i < listInProgress.length; i++) {
            Printer.messageInsertNewName(i);
            listInProgress[i] = Scanner.scan.nextLine();
        }

        return listInProgress;
    }
}
