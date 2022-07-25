package ShoppingCart;

import java.util.HashMap;
import java.util.Map;

public class Item {
    public double cost;
    public String name;

    public Item(String itemName, double itemCost) {
        this.name = itemName;
        this.cost = itemCost;
    }
}
