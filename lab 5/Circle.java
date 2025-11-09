// Student Name 	: Kobi Bourne 
// Student Id Number: C00XXXXXX
// Date 			: 23-10-2025
// Purpose 			: Sub class Circle
//I used vs code to generate my constructor, setter, getter and toString method, never did that before. very useful 

public class Circle extends Point  //extending point , we have x and y, bringing them down from superclass     
{

   
    protected double radius;    

     public Circle(int x, int y, double radius)         //constructor, calls x and y from point, using extends 
        {
            super(x, y);                //calls superclass constructor, initializes
            setRadius(radius);          //sets radius
        }


     public double getRadius() //getter for radius 
        {
            return radius;
        }

    public void setRadius(double radius)    //setter for radius 
        {
            this.radius = radius;
        }

     @Override          //takes methoed with same name as method in superclass point, implements it differently in subclass 
    public String toString()               //method to print circle info 
        {
            return "Circle [ " + super.toString() + " radius = " + radius + " ]";
        }

    
}
