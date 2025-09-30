// Student Name 	: Kobi Bourne 
// Student Id Number: C00XXXXXX
// Date 			: Sept-30-2025
// Purpose 			: Driver program 3 for Rectangle class 
/*Extend your Rectangle class in Q1 by adding a new method printRectangle()
which will draw the rectangle object by printing “*” to delineate the edges.*/
package lab2B;
public class Lab2bq3 
{
    public static void main(String[] args)
    { 
        Rectangle RecA = new Rectangle(); //object created - instance of class 
    
        RecA.setLength(7);
        RecA.setWidth(5);

        Rectangle RecB = new Rectangle(); //object created - instance of class 
        
        RecB.setLength(4);
        RecB.setWidth(10);
        
        RecA.printRectangle();
        RecB.printRectangle();
        

        
    }   

    
}

