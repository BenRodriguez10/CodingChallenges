package com.ben.adapter.payroll;

import java.math.BigDecimal;

public class IndividualPaymentInstruction implements PaymentInstruction {

    private final String name;
    private final String sortCode;
    private final String accountNo;
    private final BigDecimal amount;

    public IndividualPaymentInstruction(String name, String sortCode, String accountNo, BigDecimal amount) {
        this.name = name;
        this.sortCode = sortCode;
        this.accountNo = accountNo;
        this.amount = amount;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getSortCode() {
        return sortCode;
    }

    @Override
    public String getAccountNo() {
        return accountNo;
    }

    @Override
    public BigDecimal getAmount() {
        return amount;
    }

}