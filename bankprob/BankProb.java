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
public class BankProb {
    
    
    public static void main(String[] args) {
        Bank bank;
        bank = new Bank(100000);
        ATM atm1,atm2,atm3,atm4;
        
        atm1= new ATM(bank, 500);
        atm2= new ATM(bank,1000);
        atm3= new ATM(bank,2000);
        atm4= new ATM(bank,5000);
        
        atm1.t.start();
        atm2.t.start();
        atm3.t.start();
        atm4.t.start();
        
        
    }
    
}
