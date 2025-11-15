// Student Name 	: Kobi Bourne 
// Student Id Number: C00XXXXXX
// Date 			: Nov-15-2025
// Purpose 			: My Cat sub class
public class Cat extends Animal
{
//constructor
   public Cat(String type, int age, char gender)
   {
    super(type, age, gender);
   }
    
//methods 
   @Override //dont actually need this, left there for reminder
    public void eat()
    {  
        System.out.println("Cat is eating ");
    }

    @Override //overrides without as method signatures match ones in Animal
    public void sleep()
    {
        
        System.out.println("Cat is sleeping ");
    }

    @Override
    public void makeSound()
    {
        
        System.out.println("Meow! ");
    }

    public void spin()  //cat only method 
    {
        System.out.println("Cat spins");
    }

    @Override
    public String toString() 
    {
        return "Animal [CAT= " + getType() + ", age= " + getAge() + ", gender= " + getGender() + "]";
    }


}
