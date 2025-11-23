
// Student Name 	: Kobi Bourne 
// Student Id Number: C00XXXXXX
// Date 			: 23-11-2025
// Purpose 			: Employee1 class extending person1
public class Employee1 extends Person1
{
    //vars
    private double annualSalary;

    //constructor
    public Employee1(String name, double annualSalary)
    {
        super(name);
        this.annualSalary = annualSalary;
    }

    //methods
    @Override
    public String getDescription() 
    {
        return " An employee with a salary of " + annualSalary;
    }
}
