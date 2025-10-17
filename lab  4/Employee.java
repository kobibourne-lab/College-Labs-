
public class Employee 

{


    private String fname;
    private String lname;
    private Address address; 
    private static int nextstaffnumber=1000;
    private int employeeNumber;
    private String empType;
    private String comCarType;
    private int numOfStaff = nextstaffnumber - 1000; 

    //constructors 
    
public Employee(String fname, String lname, Address address, String empType)
    {   
        setEmployeeNumber(nextstaffnumber);
        setFname(fname);    //why were these- this.fname before changed
        setLname(lname);
        setAddress(address);
        setEmpType(empType);
        setNumOfStaff(numOfStaff);
        nextstaffnumber++;
        numOfStaff++;               //might need to be moved
    }   
//getters && setters
public int getNumOfStaff()
    {
        return numOfStaff;
    }

public void setNumOfStaff(int numOfStaff)
    {
        this.numOfStaff = numOfStaff; 
    }

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

public void setAddress( Address address) // dont not understand 
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

//toString   
public String toString()
    {
        
        return "Employee---" + fname + lname + " Address " + address + " rank " + empType + " num " + employeeNumber + "car " + comCarType;
    } 

public int numOfEmp(int numOfStaff)
    {
        return numOfStaff;
    }

}

    







