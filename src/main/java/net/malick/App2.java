package net.malick;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import net.malick.model.BankAccount;
import net.malick.model.CurrentAccount;
import net.malick.model.SavingAccount;

import java.util.*;

public class App2 {
    public static void main(String[] args) throws JsonProcessingException {


        BankAccount [] accounts= new BankAccount[4];
        accounts[0]=new CurrentAccount("CFA",1234,2345);
        accounts[1]=new CurrentAccount("CFA",2345,4550);
        accounts[2]=new SavingAccount("CFA",5000,4.5);
        accounts[3]=new SavingAccount("CFA",1294,10.5);
        for (BankAccount acc:accounts){
            System.out.println(acc.getType());
            if(acc instanceof CurrentAccount){
                System.out.println("DECOUVERT "+((CurrentAccount)acc).getOverDraft());
            }
            if (acc instanceof SavingAccount){
                System.out.println("TAUX  D'INTERET "+((SavingAccount)acc).getInteresteRate());
            }
        }
        List<BankAccount> bankAccountsList= new ArrayList<>();
        bankAccountsList.add(accounts[1]=new CurrentAccount("CFA",2345,4000));
        bankAccountsList.add(accounts[1]=new SavingAccount("CFA",3456,3.5));
        bankAccountsList.add(accounts[1]=new CurrentAccount("CFA",5000,9000));
        bankAccountsList.add(accounts[1]=new SavingAccount("CFA",9000,5.5));
        bankAccountsList.add(accounts[1]=new SavingAccount("CFA",4567,3.3));
        System.out.println("===Liste===== ");
        for (BankAccount acc:accounts){
        System.out.println(acc.getBalance());
    }
        Map<String,BankAccount> bankAccountMap=new HashMap<>();
        bankAccountMap.put("ccc1",new CurrentAccount("CFA",2345,4000));
        bankAccountMap.put("ccc2",new SavingAccount("CFA",3456,3.5));
        bankAccountMap.put("ccc3",new CurrentAccount("CFA",5000,9000));
        bankAccountMap.put("ccc4",new SavingAccount("CFA",9000,5.5));
        System.out.println("======Map======");
        BankAccount acc=bankAccountMap.get("ccc1");
        System.out.println(acc);
        for (BankAccount bac:bankAccountMap.values()
             ) {
            System.out.println(bac);
            System.out.println("========jackson-bind");
            System.out.println(toJson(bac));

        }


    }
        public static String toJson(Object o) throws JsonProcessingException {
            ObjectMapper objectMapper=new ObjectMapper();
            return objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(o);
        }
    }

