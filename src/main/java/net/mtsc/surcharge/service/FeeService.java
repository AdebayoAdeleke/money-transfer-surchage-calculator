package net.mtsc.surcharge.service;


public interface FeeService {

    /**
     * Returns the fee charge for the given amount
     * to be transferred by the customer.
     * @param amount the amount to be transferred
     * @return charge
     */
    double getCharge(double amount);
}
