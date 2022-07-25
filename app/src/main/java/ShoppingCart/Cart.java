package ShoppingCart;

import java.util.HashMap;
import java.util.Map;

public class Cart {
    Map<Item,Integer> items = new HashMap<Item,Integer>();
    private double cartBalance;
    private double discountPercentage=10.0;
    private boolean isEligibleForDiscount = false;
    private int milkCount = 0;
    private double milkPrice = 0;

    public void empty() {
        items.clear();
        this.cartBalance=0;
        this.milkPrice=0;
        this.milkCount=0;
        this.discountPercentage=10.0;
    }
    public void addItem(Item i) {
        if(items.get(i) == null) {
            items.put(i,1);
        }
        else {
            items.put(i,items.get(i) + 1);
        }
        this.cartBalance += i.cost;
        if(this.cartBalance >= 100) {
            this.isEligibleForDiscount = true;
        }
        if(i.name == "Milk") {
            this.milkCount++;
            this.milkPrice = i.cost;
        }

    }
    public void showCart() {
        System.out.println("Name\t\tQuantity\t\tPrice");
        for (Map.Entry<Item,Integer> entry : items.entrySet()) {
            Item i = entry.getKey();
            System.out.println(i.name + "\t\t" + entry.getValue() + "\t\t" + i.cost);
        }
        System.out.println("Total : " + this.cartBalance);
        System.out.println("Discount: " + getDiscount());
        System.out.println("Total after discount: " + getPayableAmount());
    }
    public double getDiscount() {
        double temp = this.cartBalance;
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
            this.cartBalance -= i.cost;
            if(this.cartBalance < 100.00) {
                this.isEligibleForDiscount = false;
            }
        }
    }
    double getPayableAmount() {
        double temp = this.cartBalance - (this.milkCount/3)*(this.milkPrice);
        if(temp >= 100.00) {
            return temp*(1 - (this.discountPercentage/100));
        }
        else {
            return temp;
        }
    }
}
