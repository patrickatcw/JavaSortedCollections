package com.me;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

//second class
public class StockList {
    private final Map<String, StockItem> list;      //map is to store stockitem

    //constructor
    public StockList() {
        this.list = new HashMap<>();
    }

    //method to add stock items
    public int addStock(StockItem item) {
        if(item != null) {
            // check if already have quantities of this item
            StockItem inStock = list.getOrDefault(item.getName(), item);
            // If there are already stocks on this item, adjust the quantity
            if(inStock != item) {
                item.adjustStock(inStock.quanityInStock());
            }

            list.put(item.getName(), item);     //.put method
            return item.quanityInStock();
        }
        return 0;
    }

    //method for selling stock
    public int sellStock(String item, int quantity) {
        StockItem inStock = list.getOrDefault(item, null);

        if((inStock != null) && (inStock.quanityInStock() >= quantity) && (quantity >0)) {
            inStock.adjustStock(-quantity);  //adjusting if above true
            return quantity;
        }
        return 0;
    }

    //getter
    public StockItem get(String key) {

        return list.get(key);
    }

    //method to return items
    public Map<String, StockItem> Items() {
        return Collections.unmodifiableMap(list);
    }

    //override method to string, returning list
    @Override
    public String toString() {
        String s = "\nStock List\n";
        double totalCost = 0.0;
        for (Map.Entry<String, StockItem> item : list.entrySet()) {     //interate through entire map
            StockItem stockItem = item.getValue();      //return single stock item

            double itemValue = stockItem.getPrice() * stockItem.quanityInStock();

            s = s + stockItem + ". There are " + stockItem.quanityInStock() + " in stock. Value of items: ";
            s = s + itemValue + "\n";
            totalCost += itemValue;
        }

        return s + "Total stock value " + totalCost;    //return everything
    }
}
