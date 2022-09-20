package com.ben.adapter;

import com.ben.adapter.hr.Employee;
import com.ben.adapter.hr.HRSystem;
import com.ben.adapter.hr.IEmployee;
import com.ben.adapter.hr.IPaymentDetail;
import com.ben.adapter.payroll.*;

public class Client {

   public static void main(String[] args) {
      // TODO
      //IEmployee employee = new Employee();

      //IPaymentDetail paymentDetail = new PaymentSystemAdapter(new EmployeePayrollSystem());
      //IPaymentDetail paymentDetail2 = new PaymentSystemNamesAdapter(new IndividualPaymentInstruction());
      //paymentDetail.getAccountNumber();
      //paymentDetail.getSortCode();

      PaymentSystemUtiliser paymentSystemUtiliser = new PaymentSystemUtiliser();
      //paymentSystemUtiliser.getAccountNumber();
      //paymentSystemUtiliser.getSortCode();



   }

}
