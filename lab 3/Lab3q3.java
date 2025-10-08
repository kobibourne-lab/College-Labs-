public class Lab3q3 
{

    public static void main(String[] args) 
    {
       
        SavingsAccount saver1 = new SavingsAccount();
        
        saver1.setSavingsBalance(2000.00);

        SavingsAccount saver2 = new SavingsAccount();

        saver2.setSavingsBalance(3000.00);
        SavingsAccount.modifyInterestRate(0.04);
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();



        
        saver1.getSavingsBalance();
        
        BankCustomer bankC1 = new BankCustomer("jack", "wicklow");
        bankC1.summary();


    }
    
}
