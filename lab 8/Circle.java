public class Circle 
{
    private double radius;
    String name; 
    String colour;

    public Circle (String name, String colour, double r)
    {
        setRadius(r);
    }
    
    public String getName() 
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public String getColour() 
    {
        return colour;
    }

    public void setColour(String colour) 
    {
        this.colour = colour;
    }

    public double getRadius()
    {
        return radius; 
    }
    public void setRadius(double r)
    {
        radius = r; 
    }
    public double area ()
    { 
        return Math.PI * Math.pow(radius, 2); 
    }
    public String toString () 
    {
        return ("Name" + name  + " Radius : " + radius + " color " + colour);
    }
    protected String hello () 
    {
        return "Hello";
    }

}