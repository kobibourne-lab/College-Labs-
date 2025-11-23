public class Triangle extends TwoDShape 
{
    //vars
    private double base;
    private double height;

    //constructor
    public Triangle(String name, String colour, double base, double height) 
    {
        super(name, colour); 
        this.base = base;
        this.height = height;
    }
    //gets sets 
    public double getBase() 
    {
        return base;
    }

    public void setBase(double base) 
    {
        this.base = base;
    }

    public double getHeight() 
    {
        return height;
    }

    public void setHeight(double height) 
    {
        this.height = height;
    }
    //methods
    @Override
    public double area() 
    {
        return 0.5 * base * height;  // assuming right angled 
    }

    @Override
    public String toString() 
    {
        return super.toString() + "\nBase = " + base + "\nHeight = " + height + "\nArea " + area(); //added area 
    }
}
