// Student Name 	: Kobi Bourne 
// Student Id Number: C00XXXXXX
// Date 			: Sept-30-2025
// Purpose 			: Rectangle class 

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
    

    public double getArea() //gets area 
    {
        area = length * width;
        return area;
    }


    public double getPerimeter()        //gets perimeter 
    {
        perimeter = 2 * (length + width);
        return perimeter;
    }
    public String toString()        //prints class instance info 
    {
        return "Length = " + length + " Width = " + width + " Area = " + area + " Perimeter = " + perimeter;
    }
    
    public void printRectangle()        //print rectangle method 
    {
        int col;        //vars, number of colums - width
        int row;        // number of rows - height
        int index;      // index , outer loops
        int jndex;      // inner loops 
        col = (int) width;      //(int) is used to convert double to int
        row = (int) length;     //gets rid of numbers after ., eg 1.5 -> 5

        for(index = 0; index < col; index++)    //top row, prints col times
            {
                System.out.print("*");
            }
        System.out.println();                   //next line 
                                                        //middle row, * and spaces
        for(index = 0; index < row - 2; index++)        //row - 2 cause we have top and bottom
            {
                System.out.print("*");                //left border 
                for(jndex = 0; jndex < col - 2; jndex++)  //for spaces inbetween 
                    {
                        System.out.print(" ");
                    }
                if( col > 1)   //right border, if rectangle wider then 1       
                    {
                        System.out.print("*");
                    }
                System.out.println(); //next line
            }
                     
        if( row > 1)   //botom if height is more then 1, if not, same as top, 1 wide
            {
                for(index = 0; index < col; index++)   //prints col stars at bottom
                    {
                        System.out.print("*");
                    }
            }        
        System.out.println(); // next line
        
    }
}
