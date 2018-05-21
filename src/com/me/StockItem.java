package com.me;

//first class created
public class StockItem implements Comparable<StockItem> {
    //variables or fields, called declaration line, or area
    private final String name;
    private double price;
    private int quantityStock = 0;

    //constructor
    public StockItem(String name, double price) {
        this.name = name;
        this.price = price;
        this.quantityStock = 0;  // or here (but you wouldn't normally do both).
    }

    //overloading constructor
    public StockItem(String name, double price, int quantityStock) {
        this.name = name;
        this.price = price;
        this.quantityStock = quantityStock;
    }

    //getters
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int quanityInStock() {
        return quantityStock;
    }

    //setter
    public void setPrice(double price) {
        if(price > 0.0) {               //if statement to condition price
            this.price = price;
        }
    }

    //method
    public void adjustStock(int quantity) {
        int newQuantity = this.quantityStock + quantity;
        if(newQuantity >=0) {           //if statement to condition price
            this.quantityStock = newQuantity;
        }
    }

    //override equals method
    @Override
    public boolean equals(Object obj) {
        System.out.println("Entering StockItem.equals");
        if(obj == this) {           //test
            return true;
        }

        if((obj == null) || (obj.getClass() != this.getClass())) {  //test
            return false;
        }

        String objName = ((StockItem) obj).getName();  //comparing
        return this.name.equals(objName);
    }

    //override hashcode method
    @Override
    public int hashCode() {
        return this.name.hashCode() + 31;
    }

    //override compare to method
    @Override
    public int compareTo(StockItem o) {
        System.out.println("Entering StockItem.compareTo");
        if(this == o) {                 //test
            return 0;
        }

        if(o != null) {
            return this.name.compareTo(o.getName());
        }

        throw new NullPointerException();   //used with compareto
    }

    //override toString
    @Override
    public String toString() {

        return this.name + " : price " + this.price;
    }
}

