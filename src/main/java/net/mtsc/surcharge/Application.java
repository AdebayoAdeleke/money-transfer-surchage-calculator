package net.mtsc.surcharge;


import net.mtsc.surcharge.model.Transaction;
import net.mtsc.surcharge.service.TransferService;
import net.mtsc.surcharge.service.impl.TransferServiceImpl;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Fortunatus Ekenachi
 * @date 2020-04-07
 */

public class Application {

    public static void main(String ...args){

        TransferService transferService = new TransferServiceImpl();

        System.out.println("======Money Transfer Surcharge Program (v1.0)===========\n");
        System.out.println("Enter the amount you want to transfer:");

        Scanner input = new Scanner(System.in);

            while (input.hasNext()) {
                try {
                    double amount = input.nextDouble();
                    Transaction transaction = transferService.doTransfer(amount);
                    System.out.println("==================================");
                    System.out.println("Amount = "+transaction.getAmount());
                    System.out.println("Transfer Amount = "+transaction.getTransferAmount());
                    System.out.println("Charge = "+transaction.getCharge());
                    System.out.println("Debit Amount = "+transaction.getDebitAmount());
                    System.out.println("==================================\n");
                    System.out.println("Enter the amount you want to transfer:");

                }
                catch (InputMismatchException e){
                    System.err.println("Invalid amount.\n");
                    System.out.println("Enter the amount you want to transfer:");

                    input = new Scanner(System.in);
                }
                catch (Exception e){
                    System.err.println("Error processing transaction: "+e.getMessage());
                    System.exit(0);
                }
            }
        }


    }

