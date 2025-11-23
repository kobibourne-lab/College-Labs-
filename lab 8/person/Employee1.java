
public class Employee1 extends Person1
{
    private double annualSalary;

    public Employee1(String name, double annualSalary)
    {
        super(name);
        this.annualSalary = annualSalary;
    }

    @Override
    public String getDescription() 
    {
        return " An employee with a salary of " + annualSalary;
    }
}
