// Student Name 	: Kobi Bourne 
// Student Id Number: C00XXXXXX
// Date 			: 17-10-2025
// Purpose 			: class for 0ffice of employees 
public class Office 
{
    public int officeNum;
    private static int nextOffice = 100;
    private int numOfEmps = 0;
    private Employee[] employees = new Employee[2];

    public Office()
        {
            setOfficeNum(nextOffice);
            nextOffice++;
        }

    public int getOfficeNum()
        {
            return officeNum;
        }

    public void setOfficeNum(int officeNum)
        {
            this.officeNum = officeNum;
        }

     public int getNumOfEmps()
        {
            return numOfEmps;
        }

    public void setNumOfEmps(int numOfEmps)
        {
            this.numOfEmps = numOfEmps;
        }
    
       public Employee[] getEmployees()
        {
            return employees;
        }

    public void setEmployees(Employee[] employees)
        {
            this.employees = employees;
        } 

    public void addEmp(Employee employee)
        {
            if (numOfEmps >=2) 
                {
                    
                    System.out.println( " office full");
                }
            else
                {
                    employees[numOfEmps]= employee;
                    numOfEmps++;
                }

        }  
        
    public String printEmp()
        {
            String empDetails = "";
            for(int i =0; i < employees.length; i ++)
                {
                    if(employees[i]!=null)
                        {
                            empDetails = empDetails + employees[i].getEmployeeNumber() + employees[i].getFname() + employees[i].getLname();  
                        }
                }
            return empDetails;
        }

    public String toString()
        {
            return " office number " + officeNum + " number of employees " + numOfEmps;
        }








    
    
}
