public class Sphere extends ThreeDShape 
{
	
	//vars
	private double radius;
	
	//constructor
	public Sphere(String name, String colour, double radius) 
    {
		super(name, colour);
		setRadius(radius);
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
	public double area() 
    {
		return  4 * Math.PI * Math.pow(radius, 2);
	}


	@Override
	public double volume() 
    {
		return 4.0/3.0 * Math.PI  * Math.pow(radius, 3);
	}

	@Override
	public String toString() 
    {
		return (super.toString() + "\nRadius = " + radius + "\nArea " + area() + "\nVolume " + volume());
	}
	
}