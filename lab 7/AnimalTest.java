// Student Name 	: Kobi Bourne 
// Student Id Number: C00XXXXXX
// Date 			: Nov-15-2025
// Purpose 			: My driver class
public class AnimalTest 
{

	public static void main (String args[])
	{
		Vet vet = new Vet("Dr. Parke"); //new vet object created 
		Animal dog = new Dog("Poodle", 4, 'M'); //new Animal god - ref var , Dog object created, polymorphism
		if (dog instanceof Dog) //casts to dog class, lets us use methods in Dog#  
		{
			System.out.println(dog);
			Dog myDog = (Dog) dog;
			myDog.sit();	//calls method in dog
			dog.eat();		//calls method in Animal
			dog.sleep();		//these can be in or out of if, both work
			dog.makeSound();
			vet.vaccinate(dog);		//calls method in vet
		}
		
		
		
		System.out.println();//line break 
		
		Animal cat = new Cat("Tom", 2, 'F'); //new cat 
		System.out.println(cat);	//print cat details, println calls toString()
		((Cat) cat).spin(); //ide offerred this way of casting, dont understand it but it works
		cat.eat();	//calls method in Animals 
		cat.sleep();
		cat.makeSound(); 
		vet.vaccinate(cat);	//calls method in vet
		System.out.println();

		}
}