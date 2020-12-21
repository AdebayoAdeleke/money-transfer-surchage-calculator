package net.mtsc.surcharge.service;


import net.mtsc.surcharge.model.Transaction;


public interface TransferService {



    /**
     * Computes the actual transfer amount for the given amount
     * and returns the transaction details.
     * @param amount amount to be transferred
     * @return the transaction details
     */
    Transaction doTransfer(double amount);
}
