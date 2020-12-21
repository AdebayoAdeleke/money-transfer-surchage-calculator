package net.mtsc.surcharge.service.impl;

import net.mtsc.surcharge.model.Transaction;
import net.mtsc.surcharge.service.TransferService;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TransferServiceImplTest {

    private TransferService transferService = new TransferServiceImpl();

    @Test
    public void givenTransferAmount_thenReturnTransactionDetails() {

        Transaction transaction = transferService.doTransfer(5000);

        assertEquals("Charge should be 10", 10.0, transaction.getCharge(), 0.0);
        assertEquals("Transfer amount should be 4990", 4990.0, transaction.getTransferAmount(), 0.0);
        assertEquals("Debit amount should be 5000", 5000.0, transaction.getDebitAmount(), 0.0);
        assertEquals("Amount should be 5000", 5000.0, transaction.getAmount(), 0.0);
    }
}
