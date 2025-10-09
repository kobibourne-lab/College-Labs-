// Student Name 	: Kobi Bourne 
// Student Id Number: C00XXXXXX
// Date 			: Sept-30-2025
// Purpose 			: Time class for driver programs

public class SavingsAccount 
{ // begin class SavingsAccount

    private static double annualInterestRate = 0.0;//Static = shared by all onject instances
    private static int nextAccountNum = 0;

    private double savingsBalance;     // 0 - 23
    private int accountNum;


    public SavingsAccount()     //constructor
        {
            nextAccountNum++;               //increments 
            setAccountNum(nextAccountNum);     //sets account number as next acc num which is +1
        }
    public SavingsAccount(double balance)
        {
            this(); //what does this do 
            setSavingsBalance(balance);
        }


    public int getAccountNum()
        {
            return accountNum;
        }

    public void setAccountNum(int accountNum)
        {
            this.accountNum = accountNum;
        }
    
    public static double getAnnualInterestRate()
        {
            return annualInterestRate;
        }
        
    public static void modifyInterestRate(double annualInterestRate)
        {
            SavingsAccount.annualInterestRate = annualInterestRate;
        }

    public double getSavingsBalance()
        {
            return savingsBalance;
        }

    public void setSavingsBalance(double savingsBalance)
        {
            this.savingsBalance = savingsBalance;
        }

    public void calculateMonthlyInterest()
        {
            
            savingsBalance = savingsBalance + (savingsBalance * annualInterestRate) /12;
            //savingsBalance+=((getSavingsBalance() * getAnnualInterestRate())/12);
             
        }
    
    public String toString()
        {
            return "account" + accountNum + " balance " + savingsBalance;
        }


} 