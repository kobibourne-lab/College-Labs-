public class MyHr
{
    public static void main(String[] args) 
    {
        int index;
        int option=0;
        Employee[] emps = new Employee[5];
        Office[] offices = new Office[3];

        for(index = 0; index <=2; index++ )
            {
                Office off = new Office();
                offices[index] =off;
            }

        while(option != 4)
            {
                System.out.println("select an option out of the following 4");
                System.out.println(" Option 1 - List all offices");
                System.out.println(" Option 2 - Create a new employee record");
                System.out.println(" Option 2 - List all employees");
                System.out.println(" Option 4 - Exit");
                option = EasyIn.getInt();

                if(option ==1)
                    {
                        for (index = 0; index < offices.length; index++) 
                        {
                            System.out.println("office " + off + "num of staff" + off.getNumOfEmps());
                            if (off.getNumOfEmps() != null) 
                                {
                                    System.out.println(off.printEmp());
                                }
                        }

                    }
                else if( option == 2)
                    {

                    }
                else if( option == 3)
                    {
                      for (index = 0; index < emps.length; index++) 
                        {
                            if (emps[index] != null) 
                                {
                                    System.out.println(emps[index]);
                                }
                        }

                    }
                else
                    {
                        System.out.println("Exit");
                    }
            }

    }
}
}