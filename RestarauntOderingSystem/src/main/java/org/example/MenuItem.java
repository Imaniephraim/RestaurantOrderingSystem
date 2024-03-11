package org.example;

public class MenuItem {


    //attributes
     private String itemName;
     private double itemPrice;

     //constructor
    public MenuItem(String itemName, double itemPrice){
        this.itemName = itemName;
        this.itemPrice = itemPrice;

    }

    public String getItemName(){
        return  itemName;
    }

    public double getItemPrice() {
        return itemPrice;
    }
}
