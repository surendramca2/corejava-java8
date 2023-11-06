package com.surendra.java.pattern;

public class Fruit implements ItemElement{


    private String name;
   private int weight;
    private int price;

    Fruit(String name, int weight , int price){

        this.name = name;
        this.weight= weight;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public int accept(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }
}
