package com.ultralesson.objectorientation.shoppingcart;

public class Item {
    public double cost;
    public String name;

    public Item(String itemName, double itemCost) {
        this.name = itemName;
        this.cost = itemCost;
    }
}
