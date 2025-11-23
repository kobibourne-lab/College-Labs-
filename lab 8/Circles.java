public class Circles extends TwoDShape
{
    //vars
    private double radius;

    //constructor
    public Circles (String name, String colour, double radius)
    {
        super(name, colour);
        this.radius = radius;
    }  

    //gets sets 
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
        return Math.PI * Math.pow(radius, 2); 
    }
    
    @Override
    public String toString () 
    {
        return super.toString() + "\nRadius = " + radius + "\nArea " + area();
    }


}