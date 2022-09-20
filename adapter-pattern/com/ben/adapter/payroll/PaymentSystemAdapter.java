package com.ben.adapter.payroll;

import com.ben.adapter.hr.HRSystem;
import com.ben.adapter.hr.IEmployee;
import com.ben.adapter.hr.IHRSystem;
import com.ben.adapter.hr.IPaymentDetail;

import java.util.Iterator;

public class PaymentSystemAdapter implements IPaymentDetail {

    PaymentInstruction paymentInstruction;
    //PaymentInstruction paymentInstruction;

    public PaymentSystemAdapter(PaymentInstruction paymentInstruction){
        this.paymentInstruction = paymentInstruction;
    }

    @Override
    public String getSortCode() {
        return "20";
    }

    @Override
    public String getAccountNumber() {
        return "40";
    }
}
