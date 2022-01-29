package com.bach.factorymethod;

public class PizzaFactory  extends BasePizzaFactory{
    @Override
    public  Pizza createPizza(int type){
        Pizza pizza;
        switch (type){
            case 1 :
                pizza = new CheesePizza();
                break;
            case 2 :
                pizza = new PepperoniPizza();
                break;
            case 3 :
                pizza = new VeggiePizza();
                break;
            default:throw new IllegalArgumentException("No such pizza");
        }
        pizza.addIngredients();
        pizza.bakePizza();
        return pizza;
    }
}
