package com.ultralesson.objectorientation.shoppingcart;

import java.awt.event.ItemEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cart {

    //TODO: Avoid mix of responisibilities.
    Map<Item,Integer> items = new HashMap<Item,Integer>(); //TODO: Avoid Explicit indexing, rather use array list
    List<Item> cartItems = new ArrayList<>();
    private double cartValue;
    private double discountPercentage=10.0;
    private boolean isEligibleForDiscount = false;
    private int milkCount = 0; //TODO: Avoid mixing data with states.
    private double milkPrice = 0; //TODO: Avoid mixing data with states.

    public void empty() {
        items.clear();
        this.cartValue =0;
        this.milkPrice=0;
        this.milkCount=0;
        this.discountPercentage=10.0;
    }
    public void addItem(Item item) {
        cartItems.add(item);

        this.cartValue += item.cost;
        if(this.cartValue >= 100) {
            this.isEligibleForDiscount = true;
        }
        if(item.name == "Milk") {
            this.milkCount++; //TODO: Make a call to Offers
            this.milkPrice = item.cost;
        }

    }

    public int getCartValue() {
        int totalCost = cartItems.stream().mapToInt(item -> (int) item.cost).sum();
    }
    public void showCart() {
        System.out.println("Name\t\tQuantity\t\tPrice");
        for (Map.Entry<Item,Integer> entry : items.entrySet()) {
            Item i = entry.getKey();
            System.out.println(i.name + "\t\t" + entry.getValue() + "\t\t" + i.cost);
        }
        System.out.println("Total : " + this.cartValue);
        System.out.println("Discount: " + getDiscount());
        System.out.println("Total after discount: " + getPayableAmount());
    }
    public double getDiscount() {
        double temp = this.cartValue;
        if(temp >= 100.00) {
            return temp*(this.discountPercentage/100.00);
        }
        else {
            return 0;
        }
    }
    void deleteItem(Item i) {
        if(items.get(i) != null) {
            items.put(i,items.get(i) - 1);
            this.cartValue -= i.cost;
            if(this.cartValue < 100.00) {
                this.isEligibleForDiscount = false;
            }
        }
    }
    double getPayableAmount() {
        double temp = this.cartValue - (this.milkCount/3)*(this.milkPrice);
        if(temp >= 100.00) {
            return temp*(1 - (this.discountPercentage/100));
        }
        else {
            return temp;
        }
    }
}
