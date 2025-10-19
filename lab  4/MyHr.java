// Student Name 	: Kobi Bourne 
// Student Id Number: C00XXXXXX
// Date 			: 17-10-2025
// Purpose 			: driver using all other classes 
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
                System.out.println(" Option 3 - List all employees");
                System.out.println(" Option 4 - Exit");
                option = EasyIn.getInt();

                if(option ==1)
                    {
                        for (index = 0; index < offices.length; index++) 
                        {
                            Office off = offices[index];
                            System.out.println("office " + index + " number of staff " + off.getNumOfEmps());
                            if (off.getNumOfEmps() > 0) 
                                {
                                    System.out.println(off.printEmp());
                                }
                        }

                    }
                else if( option == 2)           //had to ref video 
                    {
                        if(emps.length<=5)
                            {
                                String fname;
                                String lname;
                                String street;
                                String city;
                                String county;
                                String empType;
                                String comCarType;
                                System.out.println(" enter first name");
                                fname = EasyIn.getString();
                                System.out.println(" enter last name ");
                                lname = EasyIn.getString();
                                System.out.println(" enter street");
                                street = EasyIn.getString();
                                System.out.println(" enter city");
                                city = EasyIn.getString();
                                System.out.println(" enter county");
                                county = EasyIn.getString();
                                System.out.println(" enter employee type");
                                empType = EasyIn.getString();
                                comCarType = "None";                    //would not work without 
                                if(empType.equalsIgnoreCase("Manager"))
                                    {
                                        System.out.println(" enter company car type ");
                                        comCarType = EasyIn.getString();
                                    }
                                Address add = new Address(street, city, county);
                                Employee emp = new Employee(fname, lname, add, empType);
                                emp.setComCarType(comCarType);
                                emps[Employee.numOfEmployees()] = emp;
                                for (int i = 0; i < offices.length; i++)
                                    {
                                        Office off = offices[i];
                                        if(off.getNumOfEmps()<=2)
                                            {
                                                off.addEmp(emp);
                                                System.out.println("employee added to office " + i);
                                                break;
                                            }
                                    }
                             }//?? why causing issue   
                                else
                                    {
                                        System.out.println("Max employee number");
                                
                                    }

                                

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