package com.bach.factorymethod;

public class PepperoniPizza extends Pizza {

    @Override
    public void addIngredients() {
        System.out.println("Preparing ingredients for pepperroni pizza.");
    }
}
