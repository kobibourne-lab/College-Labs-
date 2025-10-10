import java.util.Arrays;

public class BankCustomer 
//stuck on this for a while,confued between 2 classes and whats using/calling what in driver.
//video on bb and trying things helped 
{
    private String name;
    private String address;
    private SavingsAccount[] savAccounts = new SavingsAccount[3];   //max of 3 savings accounts ,array size 3
    private int numAccounts=0;      //sets current number of accounts 

    public BankCustomer(String name, String address)    //constructor, paras, name and address
        {
            setName(name);
            setAddress(address);
        }
    
        public String getName()     //getter for name
            {
                return name;
            }

        public void setName(String name)        //setter for name 
            {
                this.name = name;
            }


         public String getAddress()         //getter for address 
            {
                return address;
            }

        public void setAddress(String address)  //setter for address 
            {
                this.address = address;
            }

        public SavingsAccount[] getSavAccounts()        //getter for array of accounts 
            {
                return savAccounts;
            }
        
        public void setSavAccounts(SavingsAccount[] savAccounts)    //setter for array of accounts
            {
                this.savAccounts = savAccounts;
            }

         public int getNumAccounts()       //getter for number of accounts 
            {
                return numAccounts;
            }

        public void setNumAccounts(int numAccounts)     //setter for number of accounts
            {
                this.numAccounts = numAccounts;
            }


        public void addAccount(SavingsAccount account)  //adds account 
            {
               
                if(numAccounts <= 2)        //if number of accounts is less then 3, enter loop
                    {
                        savAccounts[getNumAccounts()] = account;  //places account made in array 
                        numAccounts++;                           //number of accounts++
                    }
                else        //cant have more then 3 accounts 
                    {
                        System.out.println("account limit reached");
                    }
            }
        //gets balance of all accounts 
        public double balance(SavingsAccount[] savingsAccounts) // added para, wasnt working before. 
            {
                double balance = 0; //sets balance to 0 
                for(int i = 0; i < savAccounts.length; i++)
                    {
                        if(savAccounts[i] !=null )  //if account at 1 is not empty 
                            {
                                balance = balance + savAccounts[i].getSavingsBalance(); //adds balance of each account, 1 account per loop
                            }
                    }
                return balance; 
            }
        
        public String toString()    //used to print info for bank customer 
            {
                return "bank customer [name = " + name + ",  address = " + address + ",  Savings account= " + Arrays.toString(savAccounts) +  "]" ;
                 // Arrays.toString prints all the accounts in the array, never seen this before
            }
        

}
