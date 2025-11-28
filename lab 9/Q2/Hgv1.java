// Student Name 	: Kobi Bourne 
// Student Id Number: C00XXXXXX
// Date 			: 23-11-2025
// Purpose 			: Hgv class extending RoadVehicle implementing importDuy
public class Hgv1 extends RoadVehicle1 implements ImportDuty
{
	//var
	private String cargo;

	public Hgv1()
	{ 	
		this("",0,0,0);	
	}

	public Hgv1(String c, int w, int p, double pr)	//constructor 
	{ 
		super(w, p, pr);
		setCargo(c);
	}

	//gets&&sets
	public void setCargo(String size)
	{
		cargo = size;
	}

	public String getCargo()
	{
		return cargo;
	}
	
	//methods
	@Override
    public double calculateDuty() 
    {
        return getPrice() * HGVTAXRATE;
    }


	@Override
	public String toString() 
	{
		return "Hgv1 = " + super.toString() +" cargo = " + cargo  +"]";
	}

	
	public String toStringD() 
	{
		return "Hgv1 = " + super.toString() +" cargo = " + cargo  + ", Import Duty Price = " + calculateDuty() + "]";
	}
	
}
