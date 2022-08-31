package com.ben.adapter.payroll;

import java.math.BigDecimal;

public interface PaymentInstruction {

    /**
     * The name of the client to send the payment
     * @return the name of the client to send payment
     */
    public String getName();

    /**
     * The sort code of the client to send payment
     * This must be in the format XX-XX-XX
     * @return the sort code for this payment instruction
     */
    public String getSortCode();

    /**
     * The account number of the client to send payment
     * This must be in the format XXXX XXXX
     * @return the account number for this payment instruction
     */
    public String getAccountNo();

    /**
     * The amount to send in the payment in GBP
     * @return the amount to send in the payment
     */
    public BigDecimal getAmount();

}
