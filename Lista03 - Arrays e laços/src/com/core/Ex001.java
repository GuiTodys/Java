package com.core;

import com.services.ShoppingListCreator;
import com.services.Printer;

public class Ex001 {

    public static void main(String[] args){

        String[] shoppingList = new String[5];

        shoppingList = ShoppingListCreator.createShoppingList(shoppingList);

        Printer.informCompletedListHeaderMessage();
        Printer.informCompletedListData(shoppingList);

    }

}
