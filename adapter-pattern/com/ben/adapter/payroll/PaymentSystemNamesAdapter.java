package com.ben.adapter.payroll;

import com.ben.adapter.hr.*;

import java.util.Iterator;

public class PaymentSystemNamesAdapter implements IHRSystem {

    PaymentInstruction paymentInstruction;
    IEmployee employee;
    PaymentDetail paymentDetail;

    @Override
    public Iterator<IEmployee> getEmployees() throws PaymentFailedException {
        return null;
    }

    public Employee PaymentSystemNames(){
        String fName = employee.getFirstName();
        String lName = employee.getLastName();
        int salary = employee.getBaseSalary();
        String a1 = paymentDetail.getAccountNumber();
        String s1 = paymentDetail.getSortCode();
        PaymentDetail paymentDetail = new PaymentDetail(a1, s1);

        Employee employee = new Employee(fName, lName, salary, paymentDetail);
        return employee;
    }
}
