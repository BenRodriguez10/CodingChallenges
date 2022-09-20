package com.ben.adapter.payroll;

public class EmployeePayrollSystem implements PaymentSystem {

    private static EmployeePayrollSystem instance;

    public EmployeePayrollSystem() {}

    public static EmployeePayrollSystem getInstance() {
        if (instance == null) {
            instance = new EmployeePayrollSystem();
        }
        return instance;
    }

    @Override
    public void pay(PaymentInstruction paymentInstruction) throws PaymentFailedException {
        if (!paymentInstruction.getAccountNo().matches("^\\d{4} \\d{4}$")) {
            throw new PaymentFailedException("Account no [" + paymentInstruction.getAccountNo() + "] not in the format XXXX XXXX");
        }
        if (!paymentInstruction.getSortCode().matches("^\\d{2}-\\d{2}-\\d{2}$")) {
            throw new PaymentFailedException("Sort code not in the format XX-XX-XX");
        }
        System.out.println("**************************");
        System.out.println("* Payment Successful:");
        System.out.println("* Payee: " + paymentInstruction.getName());
        System.out.println("* " + paymentInstruction.getSortCode() + " " + paymentInstruction.getAccountNo());
        System.out.println("* Amount: £" + paymentInstruction.getAmount().toPlainString());
        System.out.println("**************************");
    }

}
