package com.designPattern1;

public class BurgerBuilder {
    private int patty;
    private int tomato;
    private int lettuce;
    private int bun;

    public BurgerBuilder setPatty(int patty) {
        this.patty = patty;
        return this;
    }

    public BurgerBuilder setTomato(int tomato) {
        this.tomato = tomato;
        return this;
    }

    public BurgerBuilder setLettuce(int lettuce) {
        this.lettuce = lettuce;
        return this;
    }

    public BurgerBuilder setBun(int bun) {
        this.bun = bun;
        return this;
    }

    public Burger getBurger(){
        return new Burger(patty, tomato, lettuce, bun);
    }
}
