
public class Dog extends Animal 
{
    


//methods 
    public void eat()
    {
        
        System.out.println(" Animal is eating ");
    }
    
    public void sleep()
    {
        
        System.out.println(" Animal is sleeping ");
    }
    
    public void makeSound()
    {
        
        System.out.println(" A generic animal sound ");
    }

    @Override
    public String toString() 
    {
        return "Animal [type=" + type + ", age=" + age + ", gender=" + gender + "]";
    }

}
