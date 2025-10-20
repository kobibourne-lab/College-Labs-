// Student Name 	: Kobi Bourne 
// Student Id Number: C00XXXXXX
// Date 			: 20-10-2025
// Purpose 			: class point
/*Create a java class called Point which will be used to describe a point in 2D
space. It will need to have two protected variables x and y to represent the
coordinates of the point. Create the necessary getter and setter methods.
Also create a toString() method */
public class point 
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








    //setters
}
