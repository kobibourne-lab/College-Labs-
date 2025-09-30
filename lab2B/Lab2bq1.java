package lab2B;


public class Lab2bq1 
{
    public static void main(String[] args)
    { 
        Rectangle RecA = new Rectangle(); //object created - instance of class 
        System.out.println("rectangle A default = "  + RecA.toString());

        RecA.setLength(20.0);
        RecA.setWidth(17);

        Rectangle RecB = new Rectangle(); //object created - instance of class 
        System.out.println("rectangle B default = "  + RecB.toString());
        
        RecB.setLength(-1);
        RecB.setWidth(41);
        
        System.out.println("rectangle A = "  + RecA.toString());
        System.out.println("rectangle B = " + RecB.toString());

        RecB.setLength(9);
        RecB.setWidth(18);

        System.out.print("rectangle B = " + RecB.toString());
    }   

    
}
