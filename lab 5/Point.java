// Student Name 	: Kobi Bourne 
// Student Id Number: C00XXXXXX
// Date 			: 23-10-2025
// Purpose 			: Super class point
public class Point
{

    protected int x;    //variables 
    protected int y;    //protected means it can be used by subclasses 

    //constructor

    public Point(int x, int y) 
        {
            setX(x);
            setY(y);
        }

    // getters and setters 
    public int getX()          
        {
            return x;
        }

    public void setX(int x) 
        {
            this.x = x;
        }

    
    public int getY() 
        {
            return y;
        }

    public void setY(int y) 
        {
            this.y = y;
        }



public String toString()        //method to print points details 
        {
            return " Point: x = " + x + " Y = " + y;
        }

}
