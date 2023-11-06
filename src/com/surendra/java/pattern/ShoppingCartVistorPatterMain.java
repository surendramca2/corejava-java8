package com.surendra.java.pattern;

public class ShoppingCartVistorPatterMain {

    public static void main(String[] args) {

        ItemElement[] items = new ItemElement[]{new Book("java",500),
        new Book("kafka", 700), new Fruit("apple",2, 120), new Fruit("banana",4,60)};

        System.out.println(calculatePrice(items));
    }

    private static int calculatePrice(ItemElement[] items){
        ShoppingCartVisitor visitor = new ShoppingCardVisitorImpl();
        int total =0;
        for (ItemElement item :items) {
            total =total+item.accept(visitor);
        }
        return total;

    }
}
