// Student Name 	: Kobi Bourne 
// Student Id Number: C00XXXXXX
// Date 			: Sept-30-2025
// Purpose 			: Driver program 2 for Rectangle class 

package lab2B;      //ask about this ?        

public class Lab2bq2 
{

    public static void main(String[] args)
    { 
        Rectangle RecA = new Rectangle();                                   //object created - instance of class 
        System.out.println("rectangle A default = "  + RecA.toString());    //prints current/default rectangle info

        RecA.setLength(5); //sets length of rectangle a to 5
        RecA.setWidth(10);  //sets width of rectangle a to 10 
        RecA.getArea();           //gets area of rectangle a
        RecA.getPerimeter();      //gets perimeter of retangle a 

        Rectangle RecB = new Rectangle(); //object created - instance of class 
        System.out.println("rectangle B default = "  + RecB.toString());
        
        RecB.setLength(-1);             //sets length of rectangle b to -1, this is out of range
        RecB.setWidth(41);        //sets width of rectangle b to 41, this is out of range
        RecB.getArea();
        RecB.getPerimeter();
        
        System.out.println("rectangle A = "  + RecA.toString());   //prints rectangle a info 
        System.out.println("rectangle B = " + RecB.toString());    //prints failed values 

        RecB.setLength(2);        //sets length of rectangle b to 2 - fixed range 
        RecB.setWidth(5);          //sets width of rectangle b to 5 - fixed range
        RecB.getArea();
        RecB.getPerimeter();

        System.out.print("rectangle B = " + RecB.toString());       //prints correct rectanlge b info
    }   


}
