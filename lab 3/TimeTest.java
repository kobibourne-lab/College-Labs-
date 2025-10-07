// Student Name 	: Kobi Bourne 
// Student Id Number: C00XXXXXX
// Date 			: Sept-30-2025
// Purpose 			: Driver program to test the Time class.
public class TimeTest
{
	public static void main (String args[])
	{
		Time t = new Time (23, 59, 59);		//creates new object of time , t 
		System.out.println(t.toMilitaryString());	//prints set time, in military style , no secs. 23:59 
		System.out.println(t.toString());			//prints set time, 23:59:59 PM
		t.tick();									//calls tick , seconds ++ , time updated, rolls over to AM
		System.out.println(t.toMilitaryString());	//now prints hour and minutes after tick called, 0000
		System.out.println(t.toString());			//now prints hour, mins , seconds after tick called, 12:00:00 AM
	}
}