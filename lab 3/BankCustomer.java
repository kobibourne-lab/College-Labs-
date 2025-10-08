public class BankCustomer 
{
    private String name;
    private String address;
    private SavingsAccount[] savAccounts = new SavingsAccount[3];
    private int numAccounts=0;

    public BankCustomer(String name, String address)
        {
            setName(name);
            setAddress(address);
        }
    
        public String getName()
            {
                return name;
            }

        public void setName(String name)
            {
                this.name = name;
            }


         public String getAddress()
            {
                return address;
            }

        public void setAddress(String address)
            {
                this.address = address;
            }

        public SavingsAccount[] getSavAccounts()
            {
                return savAccounts;
            }
        
        public void setSavAccounts(SavingsAccount[] savAccounts)
            {
                this.savAccounts = savAccounts;
            }

         public int getNumAccounts()
            {
                return numAccounts;
            }

        public void setNumAccounts(int numAccounts)
            {
                this.numAccounts = numAccounts;
            }


        public void addAccount(SavingsAccount account)
            {
               
                if(numAccounts <= 2)
                    {
                        savAccounts[getNumAccounts()] = account;
                        numAccounts++;
                    }
                else
                    {
                        System.out.println("account limit reached");
                    }
            }

        public double balance()
            {
                double balance = 0;
                for(int i = 0; i < savAccounts.length; i++)
                    {
                        if(savAccounts[i] !=null )
                            {
                                balance = balance + savAccounts[i].getSavingsBalance();
                            }
                    }
                return balance; 
            }

        public String summary()    //used to print info for bank customer 
            {
                return "bank customer [name = " + name + "address" + address + "savAccounts " + savAccounts + " ]";
                
            }

}
