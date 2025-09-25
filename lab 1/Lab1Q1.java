// Student Name 	: Kobi Bourne 
// Student Id Number: C00XXXXXX
// Date 			: Sept-22-2025
// Purpose 			: My first class implementation

public class Lab1Q1
{ // begin class Lab1Q1
	public static void main(String args[]) 
	{ // begin main method

		Thermometer thermA = new Thermometer();		// Create an instance of our Thermometer class

		System.out.println("Temp. of Thermometer A is " + thermA.getCelsius() ); //0.0
		thermA.setCelsius(20.0);
		System.out.println("Temp. of Thermometer A is " + thermA.getCelsius() );  //20.0
		
        Thermometer thermB = new Thermometer(10.0);		// Create a second instance of our Thermometer class
		System.out.println("Temp. of Thermometer B is " + thermB.getCelsius() );  //10.0
	} // end main

} // end class Lab1Q1

