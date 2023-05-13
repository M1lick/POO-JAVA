package net.malick.model;

public class CurrentAccount extends BankAccount{
    public double overDraft;

    public CurrentAccount() {
        super();

    }

    public CurrentAccount(String currency, double initialBalance, double overDraft) {
        super(currency, initialBalance);
        this.overDraft = overDraft;
    }

    @Override
    public String toString() {
        return "Current Account,OverDraft"+super.toString();
    }

    @Override
    public String getType() {
        return "Current Account";
    }

    public void setOverDraft(double overDraft) {
        this.overDraft = overDraft;
    }

    public double getOverDraft() {
        return overDraft;
    }
}
