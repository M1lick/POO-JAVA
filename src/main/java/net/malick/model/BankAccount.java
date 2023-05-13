package net.malick.model;

import java.util.Objects;
import java.util.UUID;

public abstract class BankAccount {
    private String accountId;
    private double balance;
    private String currency ;
    private   AccountStatus status ;
    public    BankAccount(){
        this.accountId= UUID.randomUUID().toString();
        status=AccountStatus.ACTIVED;
    }
    public    BankAccount(String currency,double initialBalance){
        this();
        this.currency=currency;
        this.balance=initialBalance;
    }

    public String getAccountId() {
        return accountId;
    }

    public double getBalance() {
        return balance;
    }

    public String getCurrency() {
        return currency;
    }

    public AccountStatus getStatus() {
        return  status;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void setStatus(AccountStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountId='" + accountId + '\'' +
                ", balance=" + balance +
                ", currency='" + currency + '\'' +
                ", status=" + status +
                '}';
    }

    @Override
    public boolean equals(Object acc) {
        BankAccount account= (BankAccount) acc;
        return this.accountId==account.accountId?true:false;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(this.balance)+
                Objects.hashCode(this.currency)+
                Objects.hashCode(this.status);
    }
     public abstract String getType() ;
}
