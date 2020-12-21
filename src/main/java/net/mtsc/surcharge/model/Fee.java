package net.mtsc.surcharge.model;



public class Fee {

    private double minAmount;
    private double maxAmount;
    private double feeAmount;


    public double getMinAmount() {
        return minAmount;
    }

    public void setMinAmount(double minAmount) {
        this.minAmount = minAmount;
    }

    public double getMaxAmount() {
        return maxAmount;
    }

    public void setMaxAmount(double maxAmount) {
        this.maxAmount = maxAmount;
    }

    public double getFeeAmount() {
        return feeAmount;
    }

    public void setFeeAmount(double feeAmount) {
        this.feeAmount = feeAmount;
    }

    @Override
    public String toString() {
        return "Fee{" +
                "minAmount=" + minAmount +
                ", maxAmount=" + maxAmount +
                ", feeAmount=" + feeAmount +
                '}';
    }
}
