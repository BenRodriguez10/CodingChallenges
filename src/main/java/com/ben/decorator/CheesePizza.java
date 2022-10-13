package src.main.java.com.ben.decorator;

public class CheesePizza extends PizzaDecorator {
    public CheesePizza(Pizza newPizza){

        super(newPizza);
    }

    public String bakePizza(){

        return pizza.bakePizza() + " with Cheese";
    }
}

