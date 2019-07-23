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
public class ATM implements Runnable
{
   
    Thread t;
    int debitValue;
    Bank bank;
    
    ATM(Bank bank, int i) {
        t= new Thread(this);
        debitValue= i;
        this.bank=bank;
        bank.change();
    }
    
    public void setAmount(int x)
    {
        this.debitValue=x;
    }
    
    @Override
    public void run()
    {
         while(Bank.syncc)
        {
            
        }
        Bank.syncc=!Bank.syncc;
        bank.debitx(debitValue);
        bank.showBalance();
        bank.change();
        
    }
}
