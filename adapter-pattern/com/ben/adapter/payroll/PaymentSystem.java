package com.ben.adapter.payroll;

public interface PaymentSystem {

    /**
     * Make a payment to a client using a provided payment instruction
     * @param paymentInstruction the details of the payment that is to be made.
     * @throws PaymentFailedException thrown when payment is not successful.
     */
    public void pay(PaymentInstruction paymentInstruction) throws PaymentFailedException;

}
