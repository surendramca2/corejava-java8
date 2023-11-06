package com.surendra.java.pattern;

public class ShoppingCardVisitorImpl implements ShoppingCartVisitor{
    @Override
    public int visit(Book bok) {
        int price = bok.getPrice();
        System.out.println(bok.getName()+" book price : " + price);
        return price;

    }

    @Override
    public int visit(Fruit fruit) {
        int price= fruit.getPrice();
        System.out.println(fruit.getName()+" "+ fruit.getWeight()+" kg price: "+price);
        return price;
    }
}
