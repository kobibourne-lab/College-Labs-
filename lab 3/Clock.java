// Student Name 	: Kobi Bourne 
// Student Id Number: C00XXXXXX
// Date 			: Sept-30-2025
// Purpose 			: CLOCK using time class 
import java.util.Calendar;
public class Clock 
{
    public static void main(String[] args) 
    {
        Calendar cal = Calendar.getInstance();
        Time t = new Time (cal.get(Calendar.HOUR_OF_DAY), cal.get(Calendar.MINUTE)); // new time object

        System.out.println(t.toString()); // calls to string method 

        long startTime = System.currentTimeMillis();    //new long set using .currentTimeMillis
        long currentTime = startTime;
        int oldMin = cal.get(Calendar.MINUTE);
        int newMin = oldMin;
        
        while(newMin == oldMin)
            {
                while((currentTime - startTime)< 1000) //wait a 1000 milliswconds before calling tick    
                    {
                        currentTime = System.currentTimeMillis();
                    }
                t.tick(); //calls tick , second++
                System.out.println(t.toString()); //prints
                newMin = t.getMinute();
                startTime = System.currentTimeMillis();
                currentTime = startTime;
            }

    }
    


}
