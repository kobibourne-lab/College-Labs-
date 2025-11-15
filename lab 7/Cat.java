// Student Name 	: Kobi Bourne 
// Student Id Number: C00XXXXXX
// Date 			: Nov-15-2025
// Purpose 			: My Cat sub class
public class Cat extends Animal
{

   public Cat(String type, int age, char gender)
   {
    super(type, age, gender);
   }
    
   //methods 
   @Override
    public void eat()
    {  
        System.out.println("Cat is eating ");
    }

    @Override
    public void sleep()
    {
        
        System.out.println("Cat is sleeping ");
    }

    @Override
    public void makeSound()
    {
        
        System.out.println("Meow! ");
    }

    public void spin()
    {
        System.out.println("Cat spins");
    }

    @Override
    public String toString() 
    {
        return "Animal [CAT= " + getType() + ", age= " + getAge() + ", gender= " + getGender() + "]";
    }


}
