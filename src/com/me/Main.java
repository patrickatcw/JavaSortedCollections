package com.me;

    public class Main {

        //instance
        private static StockList stockList = new StockList();

        public static void main(String[] args) {

            //instance then using instance for stocklist to all method to add stock
            StockItem temp = new StockItem("bread", 0.86, 100);
            stockList.addStock(temp);

            temp = new StockItem("cake", 1.10, 7);
            stockList.addStock(temp);

            temp = new StockItem("burgers", 12.50, 2);
            stockList.addStock(temp);

            temp = new StockItem("chair", 62.0, 10);
            stockList.addStock(temp);

            temp = new StockItem("cup", 0.50, 200);
            stockList.addStock(temp);

            temp = new StockItem("power saw", 72.95, 4);
            stockList.addStock(temp);

            temp = new StockItem("juice", 2.50, 36);
            stockList.addStock(temp);

            temp = new StockItem("smart-phone", 96.99, 35);
            stockList.addStock(temp);

            temp = new StockItem("towel", 2.40, 80);
            stockList.addStock(temp);

            temp = new StockItem("vase", 8.76, 40);
            stockList.addStock(temp);

            System.out.println(stockList);

            //run
            /*
            Stock List
            bread : price 0.86. There are 100 in stock. Value of items: 86.0
            towel : price 2.4. There are 80 in stock. Value of items: 192.0
            cake : price 1.1. There are 7 in stock. Value of items: 7.700000000000001
            chair : price 62.0. There are 10 in stock. Value of items: 620.0
            power saw : price 72.95. There are 4 in stock. Value of items: 291.8
            smart-phone : price 96.99. There are 35 in stock. Value of items: 3394.6499999999996
            vase : price 8.76. There are 40 in stock. Value of items: 350.4
            juice : price 2.5. There are 36 in stock. Value of items: 90.0
            burgers : price 12.5. There are 2 in stock. Value of items: 25.0
            cup : price 0.5. There are 200 in stock. Value of items: 100.0
            Total stock value 5157.549999999999

             */

        }
    }


