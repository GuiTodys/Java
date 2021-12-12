package com.services;

public class ShoppingListCreator {

    public static String[] createShoppingList(String[] listTemplate) {
        String[] listInProgress = new String[listTemplate.length];

        for (int i = 0; i < listInProgress.length; i++) {
            Printer.messageInsertNewListItem(i);
            listInProgress[i] = Scanner.scan.nextLine();
        }

        return listInProgress;
    }
}
