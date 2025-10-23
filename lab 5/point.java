// Student Name 	: Kobi Bourne 
// Student Id Number: C00XXXXXX
// Date 			: 23-10-2025
// Purpose 			: class point
public class Point
{

    protected int x;
    protected int y;

    //constructor

    public Point(int x, int y) 
        {
            setX(x);
            setY(y);
        }

    // gets sets 
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



public String toString()
        {
            return " Point: x = " + x + " Y = " + y;
        }

}
