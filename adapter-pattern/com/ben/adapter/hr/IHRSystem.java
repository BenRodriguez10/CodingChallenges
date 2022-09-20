package com.ben.adapter.hr;

import com.ben.adapter.payroll.PaymentFailedException;

import java.util.Iterator;

public interface IHRSystem {

    public Iterator<IEmployee> getEmployees() throws PaymentFailedException;

}
