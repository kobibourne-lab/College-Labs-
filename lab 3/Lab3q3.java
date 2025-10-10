// Student Name 	: Kobi Bourne 
// Student Id Number: C00XXXXXX
// Date 			: Oct-10-2025
// Purpose 			: Driver program testing bankcustomer and savings account.
public class Lab3q3 
{

    public static void main(String[] args) 
    {
       
        SavingsAccount saver1 = new SavingsAccount();   //instantiate object saver1
        
        saver1.setSavingsBalance(2000.00);              //sets balnce 

        SavingsAccount saver2 = new SavingsAccount(3000.00);   //instantiate object saver2, and sets balance 

        
        SavingsAccount.modifyInterestRate(0.05);    //sets interest rate to 5%

        saver1.calculateMonthlyInterest();  //updates balance based on interest rate 
        saver2.calculateMonthlyInterest();

        BankCustomer bankC1 = new BankCustomer("jack", "wicklow");      //instantiate object bankC1 , sets name ansd address
        bankC1.addAccount(saver1);                                                   //adds account saver1 to bank customr , bankC1
        bankC1.addAccount(saver2);
        
        
        System.out.println(bankC1.toString());                                      //calls to string to print bankc1 info, name address, accounts and their balance
        System.out.println("Total savings balance = " + bankC1.balance(bankC1.getSavAccounts()));   //prints total balance of both accounts added  

        
    }
    
}
