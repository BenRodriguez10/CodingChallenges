package com.designPattern1;

public class Shop {
    public static void main(String a[])  {
        Phone p = new PhoneBuilder().setOs("Android").setRam(256).getPhone();
        User u = new UserBuilder().setFirstName("Ben").setAge(22).getUser();
        Burger b = new BurgerBuilder().setPatty(2).setTomato(1).setBun(2).getBurger();
        System.out.println(p);
        System.out.println(u);
        System.out.println(b);
    }
}
