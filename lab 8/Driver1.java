public class Driver1
{
  	public static void main(String args[])
  	{ 
  		//ThreeDShape threeDShape;
  		//Shape 		shape;
  		Circles 		circle = new Circles("Circle One", "Red", 10.0);
		Rectangles      rectangle = new Rectangles("Rectangle one", "Yellow", 15.0, 20.0);
  		Cylinder	cylinder = new Cylinder("Cylinder One", "Green", 6, 8);
  		Sphere		sphere = new Sphere("Sphere One", "Blue", 77);
		Triangle    triangle = new Triangle("Trinagle", "Orange", 10, 5);
  		
  		//print them using references of the objects type
  		System.out.println("\n---Using circle reference" + circle.toString());
  		System.out.println("\n---Using rectangle reference" + rectangle.toString());
  		System.out.println("\n---Using cylinder reference" + cylinder.toString());
  		System.out.println("\n---Using sphere reference" + sphere.toString());
		System.out.println("\n---Using triangle reference" + triangle.toString());
  		
  		
		//		This will not work as a circle or a rectangle are not ThreeDShape objects
		//  	threeDShape = circle;   



		//Use a reference for the superclass to refer to an object of the subclass
		//print subclass object using references to abstract super class reference

  		/* shape = circle;  		
  		System.out.println("\n---Using shape superclass reference for a circle " + shape.toString());
  		System.out.println("Circle area = " + shape.area());   //polymorphic call using superclass reference
  		
  		shape = rectangle;
  		System.out.println("\n---Using shape superclass reference for a rectangle " + shape.toString());
  		System.out.println("Rectangle area = " + shape.area()); //polymorphic call using superclass reference
  		
  		shape = cylinder;
  		System.out.println("\n---Using shape superclass reference for a cylinder " + shape.toString());
  		System.out.println("Cylinder area = " + shape.area());  //polymorphic call using superclass reference
  		
  		threeDShape = cylinder;
  		System.out.println("\n---Using threeDShape superclass reference for a cylinder " + threeDShape.toString());
  		System.out.println("Cylinder area = " + threeDShape.area());  //polymorphic call using superclass reference
  		System.out.println("Cylinder volume = " + threeDShape.volume());  //polymorphic call using superclass reference
  	
  		
  		shape = sphere;
  		System.out.println("\n---Using shape superclass reference for a sphere " + shape.toString());		
  		System.out.println("Sphere area = " + shape.area());   //polymorphic call using superclass reference
  		
  		threeDShape = sphere;
  		System.out.println("\n---Using threeDShape superclass reference for a sphere " + threeDShape.toString());
  		System.out.println("Sphere area = " + threeDShape.area());   //polymorphic call using superclass reference
  		System.out.println("Cylinder volume = " + threeDShape.volume());  //polymorphic call using superclass reference */
		//ALL COMMENTED CODE WORKS. IT IS NOT NEEDED FOR LAB 8'S QUESTIONS. 
  	}
}