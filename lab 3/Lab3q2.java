// Student Name 	: Kobi Bourne 
// Student Id Number: C00XXXXXX
// Date 			: Oct-10-2025
// Purpose 			: Driver program to test the savings class.
public class Lab3q2 
{
    
    public static void main(String[] args) 
    {
        
        SavingsAccount.modifyInterestRate(0.04);    //sets interest rate to 4%

        SavingsAccount saver1 = new SavingsAccount();                  //instantiate object saver1
        
        saver1.setSavingsBalance(2000.00);              //sets balance to 2000.00
        saver1.calculateMonthlyInterest();                             //calls method to update balance based on interest rate 
        
        SavingsAccount saver2 = new SavingsAccount();                   //instantiate object saver2
            
        saver2.setSavingsBalance(2000.00);               
        saver2.calculateMonthlyInterest();

        System.out.println("Balance for saver1 : £"+saver1.getSavingsBalance());    //prints updated balance after interest 
        System.out.println("Balance for saver2 : £"+saver2.getSavingsBalance());

        SavingsAccount.modifyInterestRate(0.05);                 //sets interest rate to 5%

        saver1.calculateMonthlyInterest();                                          //updates balance based on new interest rate(5%) on updated balance(2006.67) 
        saver2.calculateMonthlyInterest();

        System.out.println("New balance for saver1 : £"+saver1.getSavingsBalance());    //prints new updated balance after second interest 
        System.out.println("New balance for saver2 : £"+saver2.getSavingsBalance());


    }




}
