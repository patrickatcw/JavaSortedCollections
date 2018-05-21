package com.me;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

//3rd class
public class Basket {

    private final String name;
    private final Map<StockItem, Integer> list;  //stockitem is key. integer is quantity

    //constructor, use name as peram, and initialize map
    public Basket(String name) {
        this.name = name;
        this.list = new HashMap<>();
    }

    //addtobasket method
    public int addToBasket(StockItem item, int quantity) {
        if ((item != null) && (quantity > 0)) {         //basic validation
            int inBasket = list.getOrDefault(item, 0);
            list.put(item, inBasket + quantity);
            return inBasket;
        }
        return 0;
    }

    //items method
    public Map<StockItem, Integer> Items() {

        return Collections.unmodifiableMap(list);
    }

    //override tostring method
    @Override
    public String toString() {
        String s = "\nShopping basket " + name + " contains " + list.size() + " items\n";
        double totalCost = 0.0;
        for (Map.Entry<StockItem, Integer> item : list.entrySet()) {
            s = s + item.getKey() + ". " + item.getValue() + " purchased\n";
            totalCost += item.getKey().getPrice() * item.getValue(); //incrementing total cost
        }
        return s + "Total cost " + totalCost;

        //now to main
    }

}
