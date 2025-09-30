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
        //System.out.println("rectangle A default = "  + RecA.toString());

        RecA.setLength(6);
        RecA.setWidth(5);

        Rectangle RecB = new Rectangle(); //object created - instance of class 
        //System.out.println("rectangle B default = "  + RecB.toString());
        
        RecB.setLength(-1);
        RecB.setWidth(41);
        
        //System.out.println("rectangle A = "  + RecA.toString());
        //System.out.println("rectangle B = " + RecB.toString());
        RecA.printRectangle();
        RecB.setLength(9);
        RecB.setWidth(18);

        //System.out.println("rectangle B = " + RecB.toString());
    }   

    
}

