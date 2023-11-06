package com.surendra.java.pattern;

/**
 * Visitor pattern
 */
public interface ItemElement {

int accept(ShoppingCartVisitor visitor);
}
