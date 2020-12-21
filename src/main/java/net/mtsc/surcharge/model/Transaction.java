package net.mtsc.surcharge.model;



public class Transaction {

    private double amount;
    private double transferAmount;
    private double charge;
    private double debitAmount;


    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getTransferAmount() {
        return transferAmount;
    }

    public void setTransferAmount(double transferAmount) {
        this.transferAmount = transferAmount;
    }

    public double getCharge() {
        return charge;
    }

    public void setCharge(double charge) {
        this.charge = charge;
    }

    public double getDebitAmount() {
        return debitAmount;
    }

    public void setDebitAmount(double debitAmount) {
        this.debitAmount = debitAmount;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "amount=" + amount +
                ", transferAmount=" + transferAmount +
                ", charge=" + charge +
                ", debitAmount=" + debitAmount +
                '}';
    }
}
