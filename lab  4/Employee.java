// Student Name 	: Kobi Bourne 
// Student Id Number: C00XXXXXX
// Date 			: 17-10-2025
// Purpose 			: class for Employees 
public class Employee 
{
    private String fname;
    private String lname;
    private Address address; 
    private static int nextstaffnumber=1000;
    private int employeeNumber;
    private String empType;
    private String comCarType;
    

    //constructors 
    
public Employee(String fname, String lname, Address address, String empType)
    {   
        setEmployeeNumber(nextstaffnumber);
        setFname(fname);    //why were these- this.fname before changed
        setLname(lname);
        setAddress(address);
        setEmpType(empType);
        nextstaffnumber++;
    }   
//getters && setters

public String getFname()
    {
        return fname;
    }

public void setFname( String fname)
    {
        this.fname = fname; 
    }


public String getLname()
    {
        return lname;
    }

public void setLname( String lname)
    {
        this.lname = lname; 
    }
    
public Address getAddress ()
    {
        return address;
    }

public void setAddress( Address address) 
    {
        this.address = address; 
    }

public int getEmployeeNumber()
    {
        return employeeNumber;
    }

public void setEmployeeNumber(int employeeNumber)
    {
        this.employeeNumber = employeeNumber;
    }

public String getEmpType()
    {
        return empType;
    }

public void setEmpType(String empType)
    {
        this.empType = empType;
    }

public String getComCarType()
    {
        return comCarType;
    }

public void setComCarType(String comCarType)
    {
        this.comCarType = comCarType;
    }

public static int numOfEmployees ()
    {
        return nextstaffnumber - 1000;
    }
//toString   
public String toString()
    {
        
        return "Employee---" + fname + lname + " Address " + address + " rank " + empType + " num " + employeeNumber + "car " + comCarType;
    } 



}

    







