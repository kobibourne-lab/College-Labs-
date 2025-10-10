// Student Name 	: Kobi Bourne 
// Student Id Number: C00XXXXXX
// Date 			: Sept-30-2025
// Purpose 			: Time class for driver programs

public class SavingsAccount 
{ // begin class SavingsAccount

    private static double annualInterestRate = 0.0; //Static = shared by all onject instances, same rate for all accounts 
    private static int nextAccountNum = 0;          //shared counter for next account num

    private double savingsBalance;     // not shared, var for balance. each account has different balance
    private int accountNum;            //account num, each account has different


    public SavingsAccount()     // default constructor
        {
            nextAccountNum++;               //increments account number  
            setAccountNum(nextAccountNum);     //sets account number as next acc num which is +1
        }
    public SavingsAccount(double balance)      // constructor, balance para
        {
            this(); //what does this do??       calls above constructor, gets account number  
            setSavingsBalance(balance);         //sets balance for corresponding account number 
        }


    public int getAccountNum()  //getter for account number
        {
            return accountNum;
        }

    public void setAccountNum(int accountNum)   //setter for account number 
        {
            this.accountNum = accountNum;
        }
    
    public static double getAnnualInterestRate()          //getter for interest rate, shared
        {
            return annualInterestRate;
        }
        
    public static void modifyInterestRate(double annualInterestRate)    //setter, updates rate, shared 
        {
            SavingsAccount.annualInterestRate = annualInterestRate;
        }

    public double getSavingsBalance()   //getter for balance 
        {
            return savingsBalance;
        }

    public void setSavingsBalance(double savingsBalance)    //setter for balance 
        {
            this.savingsBalance = savingsBalance;
        }

    public void calculateMonthlyInterest()     //cal interest and add to balance 
        {
            //my way 
            savingsBalance = savingsBalance + (savingsBalance * annualInterestRate) /12;
            //savingsBalance+=((getSavingsBalance() * getAnnualInterestRate())/12);
            //lab video way, anything wrong with my way ?
        }
    
    public String toString()        //prints account detaills 
        {
            return "account" + accountNum + " balance " + savingsBalance;
        }


} 