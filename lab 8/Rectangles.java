public class Rectangles extends TwoDShape 
{
	//vars
	private double length;
	private double breadth;
	
	//constructor
	public Rectangles(String name, String colour, double length, double breadth) 
    {
		super(name, colour);
		setLength(length);
		setBreadth(breadth);
	}

	//gets sets 
	public double getLength() 
    {
		return length;
	}
	public void setLength(double length) 
    {
		this.length = length;
	}
	public double getBreadth() 
    {
		return breadth;
	}
	public void setBreadth(double breadth) 
    {
		this.breadth = breadth;
	}
	
	//methods
	@Override
	public double area() 
    {
		return  length * breadth;
	}
	@Override
	public String toString() 
    {
		return (super.toString() + "\nLength = " + length + "\nBreadth = " + breadth + "\nArea " + area());
	}

}