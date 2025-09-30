// Student Name 	: Kobi Bourne 
// Student Id Number: C00XXXXXX
// Date 			: Sept-30-2025
// Purpose 			: Rectangle class 
package lab2B;
public class Rectangle
{
    private double length;
    private double width;
    private double area;
    private double perimeter;

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
    

    public double getArea()
    {
        area = length * width;
        return area;
    }


    public double getPerimeter()
    {
        perimeter = 2 * (length + width);
        return perimeter;
    }
    public String toString()
    {
        return "Length = " + length + " Width = " + width + " Area = " + area + " Perimeter = " + perimeter;
    }
    
}
