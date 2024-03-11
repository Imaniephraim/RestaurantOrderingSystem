package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        //menu items
        MenuItem[] menu = {
                new MenuItem("Burger", 500.00),
                new MenuItem("Pizza", 899.99),
                new MenuItem("Salad", 499.99),
                new MenuItem("Fries", 249.99),
        };

        //create table(array list)
        ArrayList<Table> tables = new ArrayList<>();

        tables.add(new Table(1));
        tables.add(new Table(2));
        tables.add(new Table(3));

        int userChoice;

        do{
            System.out.println("\nTables");
            //display tables
            for (Table table: tables){
                System.out.println("Table: " + table.getTableNumber());

            }
            System.out.println("0. Exit");
            System.out.println("Enter table number (0 to exit): ");
            userChoice = scanner.nextInt();

            if (userChoice > 0 && userChoice <= tables.size()) {
                Table table = tables.get(userChoice - 1);
                table.placeOrder(menu);
            }else if (userChoice != 0){
                System.out.println("Invalid choice, please try again!!");
            }

        }while (userChoice != 0);

            //close the scanner class
            scanner.close();
    }
}