package net.malick.model;

public class SavingAccount extends BankAccount{
    public double interesteRate;

    public SavingAccount() {
        super();
    }

    @Override
    public String getType() {
        return "Saving Account";
    }

    public SavingAccount(String currency, double initialBalance, double interesteRate) {
        super(currency, initialBalance);
        this.interesteRate = interesteRate;
    }

    public void setInteresteRate(double interesteRate) {
        this.interesteRate = interesteRate;
    }

    public double getInteresteRate() {
        return interesteRate;
    }
}
