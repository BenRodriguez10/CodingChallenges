package com.ben.adapter.hr;

class Employee implements IEmployee {

    private final String firstName;
    private final String lastName;
    private final int baseSalary;
    private final PaymentDetail paymentDetail;

    public Employee(String firstName, String lastName, int baseSalary, PaymentDetail paymentDetail) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.baseSalary = baseSalary;
        this.paymentDetail = paymentDetail;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public int getBaseSalary() {
        return baseSalary;
    }

    @Override
    public IPaymentDetail getPaymentDetail() {
        return paymentDetail;
    }

}
