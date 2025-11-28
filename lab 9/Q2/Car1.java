// Student Name 	: Kobi Bourne 
// Student Id Number: C00XXXXXX
// Date 			: 23-11-2025
// Purpose 			: Car class extending RoadVehicle implementing importDuy

public class Car1 extends RoadVehicle1 implements ImportDuty
{
    //car
	private String carType;
 
	public Car1() 
    {
	 	this("", 0, 0, 0); //default constructor
	}
 
	public Car1(String c, int w, int p, double pr) //cponstructor
    { 
		super(w, p, pr);        //calls supers
		setType(c);
	}
 
    //gets && sets
	public void setType(String t)  
    {
		carType = t;
	}
 
	public String getType() 
    {
		return carType;
	}

    //methods

    @Override
    public double calculateDuty() 
    {
       return getPrice() * CARTAXRATE;
    }

    @Override
    public String toString() {
        return "Car1 = " + super.toString() + "  [carType=" + carType + "]";
    }

    
}