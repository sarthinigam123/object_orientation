package com.ultralesson.objectorientation.shoppingcart;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        Wallet w1 = new Wallet(250);

        Cart c1 = new Cart();
        Item i1 = new Item("Milk", 35.5);
        Item i2 = new Item("Apple", 60.5);
        Item i3 = new Item("NewsPaper", 2.5);
        boolean flag = true;
        while(flag) {
            int choice = 0;
            System.out.print("Enter 1 to add milk\n 2 to delete milk\n 3 to add apple\n 4 to delete apple\n 5 to add NewsPaper\n 6 to delete NewsPaper\n 7 to showPayableAmount \n8 to payAndCheckOut:\n ");
            choice = myObj.nextInt();
            switch(choice) {
                case 1: c1.addItem(i1);
                    break;
                case 2: c1.deleteItem(i1);
                    break;
                case 3: c1.addItem(i2);
                    break;
                case 4: c1.deleteItem(i2);
                    break;
                case 5: c1.addItem(i3);
                    break;
                case 6: c1.deleteItem(i3);
                    break;
                case 7: c1.showCart();
                    break;
                case 8: if(w1.checkBalance( c1.getPayableAmount() ) ){
                    w1.debitBalance(c1.getPayableAmount());
                    System.out.println("Succesfully Checked Out");
                    System.out.println("Updated wallet balance is "+ w1.balance);
                    flag = false;
                }
                else {
                    System.out.println("Wallet balance low!");
                }
                    break;
                case 9: System.out.println("Wallet Balance is "+w1.balance);
                    break;
            }
        }
    }
}
