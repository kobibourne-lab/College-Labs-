
public class Cat extends Animal
{

   public Cat(String type, int age, String gender)
   {
    super(type, age, gender);
   }
    
   //methods 
   @Override
    public void eat()
    {  
        System.out.println(" Cat is eating ");
    }

    @Override
    public void sleep()
    {
        
        System.out.println(" Cat is sleeping ");
    }

    @Override
    public void makeSound()
    {
        
        System.out.println(" Meow! ");
    }

    @Override
    public String toString() 
    {
        return "Animal [type=" + type + ", age=" + age + ", gender=" + gender + "]";
    }


}
