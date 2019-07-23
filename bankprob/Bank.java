/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankprob;

/**
 *
 * @author RSD
 */
public class Bank {
     public static boolean syncc;
    int balance;
    Bank(int balance)
    {
        this.balance=balance;
    }
    Bank()
    {
        this.balance=100000;
    }
    
    public void debit (int x)
    {
        System.out.println("Debit amount: "+ x);
        balance=balance-x;
    }
    
    public void debitx(int x)
    {
        //syncc=!syncc;
        debit(x);
        //syncc=!syncc;
    }
    
    public void showBalance()
    {
        System.out.println("The current balance is: "+ balance);
    }
    
    public void change()
    {
        syncc=!syncc;
    }
}
