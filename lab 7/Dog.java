// Student Name 	: Kobi Bourne 
// Student Id Number: C00XXXXXX
// Date 			: Nov-15-2025
// Purpose 			: My Dog sub class
public class Dog extends Animal 
{
    
//constructor
    public Dog(String type, int age, char gender)
    {
        super(type, age, gender);
    }
    

// Animal methods 
    public void eat()
    {
        
        System.out.println("Dog is eating ");
    }
    
    public void sleep()
    {
        
        System.out.println("Dog is sleeping ");
    }
    
    public void makeSound()
    {
        
        System.out.println("Woof! ");
    }
//dog only method
    public void sit()  
    {   
        System.out.println("Dog is now sitting");
    }

    @Override
    public String toString() 
    {
        return "Animal [DOG= " + getType() + ", age= " + getAge() + ", gender= " + getGender() + "]";
    }

}
