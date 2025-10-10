// Student Name 	: Kobi Bourne 
// Student Id Number: C00XXXXXX
// Date 			: Sept-30-2025
// Purpose 			: CLOCK using time class 
import java.util.Calendar;      // import Calendar class from java.util
public class Clock 
{
    public static void main(String[] args) 
    {
        Calendar cal = Calendar.getInstance();                 //new calendar object, uses import cal, sets cal to current time, eg- 2025-10-10 13:38
        Time t = new Time (cal.get(Calendar.HOUR_OF_DAY), cal.get(Calendar.MINUTE)); //new time object, gets min and hour from calender, sets time, min = 38, hour=13
                                                                                     //seconds default 0, in consturctor 
        System.out.println(t.toString());                                           // calls to string method on t, prints time 

        long startTime = System.currentTimeMillis();    //the difference, in milliseconds, between current time and midnight, January 1, 1970 UTC. thats what java says 
        long currentTime = startTime;                   //sets current time to start time
        int oldMin = cal.get(Calendar.MINUTE);          //sets oldMin to current min   
        int newMin = oldMin;                            //sets newMin to oldMin
        
        while(newMin == oldMin)             //Enter loop until minute changes
            {
                while((currentTime - startTime)< 1000) //wait a 1000 milliswconds before calling tick    
                    {
                        currentTime = System.currentTimeMillis(); //updates current time 
                    }
                t.tick();                                   //calls tick , second++
                System.out.println(t.toString());           //prints the updated time 
                newMin = t.getMinute();                     //update newMin to t's minute?
                //reset time 
                startTime = System.currentTimeMillis();     //set start time to time after tick 
                currentTime = startTime;                    //set currentTime to startTime
            }

    }
    


}
