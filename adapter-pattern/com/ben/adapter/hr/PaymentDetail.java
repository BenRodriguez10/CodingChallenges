package com.ben.adapter.hr;

public class PaymentDetail implements IPaymentDetail {

    private final String sortCode;

    private final String accountNumber;

    public PaymentDetail(String sortCode, String accountNumber) {
        this.sortCode = sortCode;
        this.accountNumber = accountNumber;
    }

    @Override
    public String getSortCode() {
        return sortCode;
    }

    @Override
    public String getAccountNumber() {
         return accountNumber;
    }

}
