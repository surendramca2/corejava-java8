package com.surendra.java.pattern;

public interface ShoppingCartVisitor {

    int visit(Book bok);
    int visit(Fruit fruit);
}
