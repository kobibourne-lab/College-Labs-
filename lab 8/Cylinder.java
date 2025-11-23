public class Cylinder extends ThreeDShape 
{
    //vars
    private double height;
    private double radius;

    //constructor
    public Cylinder (String name, String colour, double radius , double height)
    {
        super(name, colour);
        setRadius(radius);
        setHeight(height);
    }

    //gets sets 
    public void setHeight(double height)
    {
        this.height = height; 
    }
    public double getHeight()
    {
        return height; 
    }

    public double getRadius() 
    {
        return radius;
    }
    public void setRadius(double radius) 
    {
        this.radius = radius;
    }

    //methods
    @Override
    public double area ()
    {
        return 2 * Math.PI * radius * (radius + height);
        
    }

    @Override
    public double volume() 
    {
        return Math.PI * radius * radius * height;
    }

    @Override
    public String toString ()
    {
    return (super. toString () + "\nHeight = " + height + "\nArea " + area() + "\nVolume " + volume());
    }



}