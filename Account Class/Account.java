
/**
 * A simple class for demonstration of how to use classes and objects
 * @author COMP1161  
 * @version 1.00
 */
public class Account
{
    // instance variables - replace the example below with your own
   
  private double balance;
  private double lastDeposit;
  private double lastWithdraw;
  
  
    /**
     * Constructor #1 - account balance set to default (0.00)
     */
    public Account()
    {
        // initialise instance variables
        balance = 0.0;
        lastDeposit = 0.00;
        lastWithdraw = 0.0;
   }
   
   /**
    * Constructor #2 - set account balance to a specified amount
    * @param bal starting balance for account
    */
   public Account(double bal)
   {
       this.balance = bal;
    }

   
    /**
     * deposit an amount to account
     * @param amt amount to be deposited
     * @return  void
     */
    public void deposit(double amt)
    {
        balance += amt;
    }
   
   
    /**
     * withdraw an amount from account
     * @param amount to be withdrawn
     */
    public void withdraw(double amt)
    {
        balance -= amt;
    }
    
    
    /**
     * check account balance
     * @param none
     * @return account balance
     */
    public double balance()
    {
        return this.balance;
    }    

    public String toString()
    {
        return "Account baance: " + balance;
    }
}