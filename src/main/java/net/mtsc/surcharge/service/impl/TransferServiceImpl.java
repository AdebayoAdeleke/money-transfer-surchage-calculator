package net.mtsc.surcharge.service.impl;


import net.mtsc.surcharge.model.Transaction;
import net.mtsc.surcharge.service.FeeService;
import net.mtsc.surcharge.service.TransferService;

/**
 * A Transfer Service implementation class that
 * handles customer transfers.
 *
 * @author Fortunatus Ekenachi
 * @date 2020-04-07
 */

public class TransferServiceImpl implements TransferService {


    private final FeeService feeService;

    public TransferServiceImpl() {
        this.feeService = new FeeServiceImpl();
    }


    /**
     * Computes the actual transfer amount for the given amount
     * and returns the transaction details.
     * @param amount amount to be transferred
     * @return the transaction details
     */
    @Override
    public Transaction doTransfer(double amount) {

        double charge = feeService.getCharge(amount);
        double transferAmount = amount - charge;
        Transaction transaction = new Transaction();
        transaction.setAmount(amount);
        transaction.setCharge(charge);
        transaction.setTransferAmount(transferAmount);
        transaction.setDebitAmount(amount);
        return transaction;
    }
}
