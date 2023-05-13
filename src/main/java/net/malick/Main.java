package net.malick;

import net.malick.model.BankAccount;
import net.malick.model.CurrentAccount;
import net.malick.model.SavingAccount;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {

        System.out.println("**************************************");

        BankAccount account1;
        account1 = new CurrentAccount();
        //account1.setAccountId("123-4567");
        account1.setCurrency("CFA");
        account1.setBalance(7600);

        printAccount(account1);
        BankAccount account2= new CurrentAccount("Cfa",1502500,400);
        printAccount(account2);
        BankAccount account3= new SavingAccount("Cfa",1502500,3.4);
        System.out.println("**************************************");
        System.out.println(account2.equals(account3));
        System.out.println("**************************************");
        account3.setAccountId(account2.getAccountId());
        System.out.println(account2);
        System.out.println(account3);
        System.out.println("**************************************");
        System.out.println(account2.hashCode()==account3.hashCode()?"les deux compte on le meme etat":"les deux compte n'ont pas le meme etat");
        account3.setCurrency("USD");
        System.out.println(account2.hashCode()==account3.hashCode()?"les deux compte on le meme etat":"les deux compte n'ont pas le meme etat");
        System.out.println("**************************************");
        System.out.println(account2==account3);
        System.out.println(account2.equals(account3));

    }
    public  static void printAccount(BankAccount account){
        System.out.println("******************************************");
        System.out.println("Account ID="+ account.getAccountId());
        System.out.println("Balance ="+ account.getBalance());
        System.out.println("currency="+ account.getCurrency());
        System.out.println("Statues ="+ account.getStatus());
        System.out.println(account);
        System.out.println(account.hashCode());
        System.out.println(account.equals(account));


        System.out.println("******************************************");
    }
}