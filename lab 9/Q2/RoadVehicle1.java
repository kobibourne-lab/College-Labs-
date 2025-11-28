// Student Name 	: Kobi Bourne 
// Student Id Number: C00XXXXXX
// Date 			: 28-11-2025
// Purpose 			: super class RoadVehicle 
public abstract class RoadVehicle1
{
	private int wheels;	    //How many wheels it has
	private int passengers; //How many passengers it can carry
    private double price;   //price of vehicle 
 
	public RoadVehicle1()       //default constructor
    {
 		this(0,0,0);	
	}
 
	public RoadVehicle1(int w, int p, double pr) //constructor
    { 
		setPrice(pr);
        setWheels(w);
		setPass(p);
	}

    
    //gets && sets
	public double getPrice() 
    {
        return price;
    }

    public void setPrice(double price) 
    {
        this.price = price;
    }

    public void setWheels(int num) 
    {
		wheels = num;
	}
 
	public int getWheels() 
    {
		return wheels;
	}
 
	public void setPass(int num) 
    {
		passengers = num;
	}
 
	public int getPass() 
    {
		return passengers;
	}

    //toString
    @Override
    public String toString() 
    {
        return " [wheels=" + wheels + ", passengers=" + passengers + ", price=" + price + "]";
    }

}
