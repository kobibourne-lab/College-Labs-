package lab2B;

/*Develop a java class called Rectangle.
The class has attributes length and width, each of which defaults to 1 in the constructor. 
It has set and get methods
for both length and width. The set methods should verify that length and width
are each numbers larger than 0.0 and less than or equal to 40.0. Lastly, the class
should have a toString() method which will return a string like the following:
"Length = 5, Width = 10”
Write a suitable driver program to test each of your methods in class Rectangle.
public class Rectangle*/ 
public class Rectangle
{
    private double length;
    private double width;

    public Rectangle() //default constructor 
    {
        setLength(1);
        setWidth(1);
    }

    public double getLength() //getter 
    {
        return length;
    }
    
    public void setLength(double length) //setter
    {
       if(length > 0.0 && length <= 40.0)
            {
                this.length = length;
            }
        else
            {
                System.out.println( "length out of value range ");
            }
        
    }

    public double getWidth() //getter 
    {
        return width;
    }
    
    public void setWidth(double width) //setter
    {
       if(width > 0.0 && width <= 40.0)
            {
                this.width = width;
            }
        else
            {
                System.out.println( "width out of value range ");
            } 
    }

    public String toString()
    {
        return "Length = " + length + " Width = " + width;
    }
    
}
