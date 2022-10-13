package src.main.java.com.ben.decorator;

public class Client {
    public static void main(String[] args) {
        Pizza pizza = new PepperoniPizza(new BasicPizza());
        System.out.println(pizza.bakePizza());

        Pizza cheesePizza = new CheesePizza(new PepperoniPizza(new BasicPizza()));
        System.out.println(cheesePizza.bakePizza());
    }
}
