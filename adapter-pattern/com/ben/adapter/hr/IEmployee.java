package com.ben.adapter.hr;

public interface IEmployee {

    /**
     * Get the employees first name
     * @return the first name of the employee
     */
    public String getFirstName();

    /**
     * Get the employees last name
     * @return the last name of the employee
     */
    public String getLastName();

    /**
     * Base salaries are whole numbers representing the amount an
     * employee earns per year in GBP. E.g. a return value of
     * 22500 equates to a base salary of £22,500.00GBP
     * @return the base salary of this employee for the year in GBP
     */
    public int getBaseSalary();

    /**
     * The payment details to be used for this employee for paying
     * their wages.
     * @return An IPaymentDetail object holding the payment details
     * of this employee.
     */
    public IPaymentDetail getPaymentDetail();

}
