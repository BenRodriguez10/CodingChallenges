package com.designPattern1;

public class Burger {
    private int patty;
    private int tomato;
    private int lettuce;
    private int bun;

    public Burger(int patty, int tomato, int lettuce, int bun) {
        this.patty = patty;
        this.tomato = tomato;
        this.lettuce = lettuce;
        this.bun = bun;
    }

    @Override
    public String toString() {
        return "Burger{" +
                "patty=" + patty +
                ", tomato=" + tomato +
                ", lettuce=" + lettuce +
                ", bun=" + bun +
                '}';
    }
}
