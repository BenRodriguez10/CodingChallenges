package com.ben.adapter.hr;

public interface IPaymentDetail {

    /**
     * Get the sort code for this payment detail.
     * In the format XXXXXX
     * @return the sort code for these payment details
     */
    public String getSortCode();

    /**
     * Get the account number for this payment detail.
     * In the format XXXXXXXX
     * @return the account number for these payment details
     */
    public String getAccountNumber();

}
