package com.designPattern1;

public class UserBuilder {
    private String firstName;
    private String lastName;
    private int age;
    private String gender;

    public UserBuilder setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public UserBuilder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public UserBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public UserBuilder setGender(String gender) {
        this.gender = gender;
        return this;
    }

    public User getUser(){
        return new User(firstName, lastName, age, gender);
    }
}
