package org.example;

import java.util.HashMap;
import java.util.Map;

public class Order {
    //attributes
    private Map<MenuItem,Integer> items;

    //constructor
    public Order(){
    }

    public Map<MenuItem, Integer> getItems() {
        items = new HashMap<>();

        return null;
    }


    //a method to add an item to our collection
    public void addItem(int quantity, MenuItem){items.put(item, items.getOrDefault(item, 0) + quantity);
    }

    //a method to display the order
    public void displayOrder(){
        double total = 0;

        System.out.println("Ordered items:");

        for (Map.Entry<MenuItem, Integer> entry: items.entrySet()){
            MenuItem item = entry.getKey();
            int quantity = entry.getValue();

            double subTotal = item.getItemPrice() * quantity;
            System.out.println(item.getItemPrice() + " x " + quantity + " - ksh" + subTotal);
            total += subTotal;

        }
        System.out.println("Total: ksh" + total);
    }
}















