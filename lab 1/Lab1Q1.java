// Student Name 	: Kobi Bourne 
// Student Id Number: C00XXXXXX
// Date 			: Sept-22-2025
// Purpose 			: My first class implementation

public class Lab1Q1
{ // begin class ThermB
	public static void main(String args[]) 
	{ // begin main method

		Thermometer thermA = new Thermometer();		// Create an instance of our Thermometer class

		System.out.println("Temp. of Thermometer A is " + thermA.getCelsius() );
		thermA.setCelsius(20.0);
		System.out.println("Temp. of Thermometer A is " + thermA.getCelsius() );
		
        Thermometer thermB = new Thermometer();		// Create a second instance of our Thermometer class
		thermB.setCelsius(10.0);
		System.out.println("Temp. of Thermometer A is " + thermB.getCelsius() );
	} // end main
} // end class ThermTest