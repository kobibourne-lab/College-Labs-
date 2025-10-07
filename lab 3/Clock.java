/*Provide another driver program Clock.java that will create a Time object - you should
pass to the Time constructor method the current time in hours and minutes. Hint:
use java.util.Calendar to create the time object as follows:
Calendar cal = Calendar.getInstance();
Time t = new Time (cal.get(Calendar.HOUR_OF_DAY), cal.get(Calendar.MINUTE));
Next, write a loop that calls method tick() every second and then prints the
stored time. The loop (and program) should terminate when the stored time
advances to the next minute.
Hint: to find out when a second has passed you will need to use
System.currentTimeMillis() which returns the number of milliseconds
elapsed since January 1, 1970. There are 1000 milliseconds in 1 second.
*/ import java.util.Calendar;
public class Clock 
{
    public static void main(String[] args) 
    {
        Calendar cal = Calendar.getInstance();
        Time t = new Time (cal.get(Calendar.HOUR_OF_DAY), cal.get(Calendar.MINUTE));

        System.out.println(t.toString());

        long startTime = System.currentTimeMillis();
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
                System.out.println(t.toString());
                newMin = t.getMinute();
                startTime = System.currentTimeMillis();
                currentTime = startTime;
            }

    }
    


}
