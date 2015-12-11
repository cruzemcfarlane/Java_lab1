package lab2;
import java.util.*;


public class MyATM
{
    public static void main(String[] arg)
    {
        System.out.println("WECLOME TO MY ATM\n");
        
        System.out.println("DS - Deposit to Savings Account");
        System.out.println("DC - Deposit to chequing Account\n");
        
        System.out.println("WS - Withrawal from Savings Account");
        System.out.println("WC - Withdrawal from Chequing Account\n");
        
        System.out.println("TS - Transfer to Savings Account");
        System.out.println("TC - Transfer to Chequing Account\n");
        
        System.out.println("BL - Display Account Balance");
        
        System.out.println("\nQ - Quit the program");
        
        Scanner scan1 = new Scanner(System.in);
        System.out.print("\nSelect an option -> ");        
        String option = scan1.nextLine();
         
        Account mySavingAcct = new Account(1000.00); //Savings Account initialized at $1000
        Account myChequeAcct = new Account(1000.00); //Chequing Account initalized at $1000
        
        if (option.toUpperCase().equals("BL"))
        {
            System.out.println("\nBalance (Savings): " +mySavingAcct.balance());
            System.out.println("Balance (Chequing): " +myChequeAcct.balance());
        }
        
        else
        {
            System.out.print("\nEnter amount: ");            
            double amount = scan1.nextDouble(); //Money that will be withdrawn or deposited
            
                    
            if (option.toUpperCase().equals("DS"))
            {
                mySavingAcct.deposit(amount);
                System.out.println("\nBalance: " +mySavingAcct.balance());
            }
           
            else if (option.toUpperCase().equals("DC"))
            {
                myChequeAcct.deposit(amount);
                System.out.println("\nBalance: " +myChequeAcct.balance());
            }
                    
            else if (option.toUpperCase().equals("WS"))
            {
                mySavingAcct.withdraw(amount);
                System.out.println("\nBalance: " +mySavingAcct.balance());
            }
            
            else if (option.toUpperCase().equals("WC"))
            {
                myChequeAcct.withdraw(amount);
                System.out.println("\nBalance: " +myChequeAcct.balance());
            }
            
            else if (option.toUpperCase().equals("TS"))
            {
                myChequeAcct.withdraw(amount);
                mySavingAcct.deposit(amount);
                System.out.println("\nBalance (Savings): " +mySavingAcct.balance());
                System.out.println("Balance (Chequing):" +myChequeAcct.balance());
            }
            
            else if (option.toUpperCase().equals("TC"))
            {
                mySavingAcct.withdraw(amount);
                myChequeAcct.deposit(amount);
                System.out.println("\nBalance (Chequing): " +myChequeAcct.balance());
                System.out.println("Balance (Savings): " +mySavingAcct.balance());
            }
        }        
    }
}
        