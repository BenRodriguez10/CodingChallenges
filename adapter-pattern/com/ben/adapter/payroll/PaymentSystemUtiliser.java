package com.ben.adapter.payroll;

import com.ben.adapter.hr.IPaymentDetail;

public class PaymentSystemUtiliser implements IPaymentDetail {

    PaymentSystemAdapter paymentSystemAdapter;

    @Override
    public String getSortCode() {
        return paymentSystemAdapter.getSortCode();
    }

    @Override
    public String getAccountNumber() {
        return paymentSystemAdapter.getAccountNumber();
    }
}
