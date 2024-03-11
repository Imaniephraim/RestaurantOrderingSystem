package org.example;
import java.util.Scanner;

public class Table {

    //attributes

    private int tableNumber;
    private Order order;

    //constructor
    public Table (int tableNumber) {
        this.tableNumber = tableNumber;
        this.order = new Order();

    }

    public int getTableNumber() {
        return tableNumber;

    }

    //a method for placing the order
    public void placeOrder(MenuItem[] items) {
        Scanner scanner = new Scanner(System.in);

        int userChoice;
        do{
            System.out.println("\nCPL Restaurant Menu");
            
            for(int i = 0; i < menu.length; i++){
                System.out.println(i + 1) + ". " + menu[i].getItemName() + " - ksh" + menu[i].getItemPrice();

            }

            System.out.println("0. Place Order");
            System.out.println("Enter your choice (0 to place order): ");
            userChoice = scanner.nextInt();

            if (userChoice > 0 && userChoice <= menu.length) {
                System.out.println("Enter quantity: ");
                int quantity = scanner.nextInt();
                order.addItem(menu[userChoice-1], quantity);
            }else if (userChoice != 0){
                System.out.println("Invalid choice, Please try again!!!");
            }

        } while (userChoice != 0);

        //display the order summary for a table
        System.out.println("\nOrder Summary For Table No: " + tableNumber);
        order.displayOrder();

        //close scanner object
        scanner.close();
    }


















}
