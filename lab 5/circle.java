// Student Name 	: Kobi Bourne 
// Student Id Number: C00XXXXXX
// Date 			: 23-10-2025
// Purpose 			: class point
/* Create a subclass of Point called Circle which will need an additional
attribute called radius. Define the necessary getter and setter methods for
radius. */

public class Circle extends Point       
{

   
    double radius;

     public Circle(int x, int y, double radius) 
        {
            super(x, y);
        
        }


     public double getRadius() 
        {
            return radius;
        }

    public void setRadius(double radius)   
        {
            this.radius = radius;
        }

     @Override
    public String toString() 
        {
            return "Circle [ x = " + x + " Y = " + y + " radius = " + radius + " ]";
        }

    
}
