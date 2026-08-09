package Ecommerce;

import Ecommerce.Exception.BankAccountException;

public class BankAccount {
    private String accountNumner;
    private double balance;


    public BankAccount(String accountNumner,double balance){
        this.balance=balance;
        this.accountNumner=accountNumner;
    }
    public void deposit(double amount ){
        try{
            if(amount<=0){
                throw new BankAccountException("Amount should be > 0");
            }
            balance+=amount;
        }catch(Exception e){
            System.out.println(e.getMessage());
        }finally{
            System.out.println("finally");//runs after try or catch
        }
    }

    public void withdraw(double amount) throws Exception {
     if(amount<=0){
         throw new Exception("amount should be >0");
     }
     if(amount>balance){
         throw new BankAccountException("Insufficient balance");
     }
     balance -= amount;
    }


}
