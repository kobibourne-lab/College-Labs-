// Student Name 	: Kobi Bourne 
// Student Id Number: C00XXXXXX
// Date 			: Sept-30-2025
// Purpose 			: Driver program for Rectangle class 

public class Lab2bq1 
{
    public static void main(String[] args)
    { 
        Rectangle RecA = new Rectangle(); //object created - instance of class 
        System.out.println("rectangle A default = "  + RecA.toString());

        RecA.setLength(20.0); //sets object RecA length 
        RecA.setWidth(17);    //sets object width 

        Rectangle RecB = new Rectangle(); //object created - instance of class 
        System.out.println("rectangle B default = "  + RecB.toString()); //print current value
        
        RecB.setLength(-1);        //sets object RecB length - out of range 
        RecB.setWidth(41);   //sets object RecB width - out of range  
        
        System.out.println("rectangle A = "  + RecA.toString());    //prints new loaded value 
        System.out.println("rectangle B = " + RecB.toString());     //prints fail message and current value

        RecB.setLength(9);   //sets object Recb length, fix range  
        RecB.setWidth(18);    //sets object Recb width, fix range  

        System.out.print("rectangle B = " + RecB.toString());   //prints fail message and current value
    }   

    
}
