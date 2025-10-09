public class Lab3q3 
{

    public static void main(String[] args) 
    {
       
        SavingsAccount saver1 = new SavingsAccount();
        
        saver1.setSavingsBalance(2000.00);

        SavingsAccount saver2 = new SavingsAccount(3000.00);

        
        SavingsAccount.modifyInterestRate(0.05);

        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        BankCustomer bankC1 = new BankCustomer("jack", "wicklow");
        bankC1.addAccount(saver1);
        bankC1.addAccount(saver2);
        
        
        System.out.println(bankC1.toString());
        System.out.println("Total savings balance = " + bankC1.balance(bankC1.getSavAccounts()));

        
    }
    
}
