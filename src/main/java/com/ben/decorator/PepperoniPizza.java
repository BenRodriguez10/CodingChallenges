package src.main.java.com.ben.decorator;

public class PepperoniPizza extends PizzaDecorator {
    public PepperoniPizza(Pizza newPizza){
        super(newPizza);
    }
    public String bakePizza(){
        return pizza.bakePizza() + " with Pepperoni";
    }
}

