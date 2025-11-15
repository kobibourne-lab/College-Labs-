// Student Name 	: Kobi Bourne 
// Student Id Number: C00XXXXXX
// Date 			: Nov-15-2025
// Purpose 			: My Animal super class
public class Animal 
{
//variables
    private int age;
    private String type; 
    private char gender;

    
//constructor 
    public Animal(String type, int age, char gender) 
    {
        this.age = age;
        this.type = type;
        this.gender = gender;
    }

    
//getters and setters 
    public int getAge() 
    {
        return age;
    }



    public void setAge(int age) 
    {
        this.age = age;
    }



    public String getType() 
    {
        return type;
    }



    public void setType(String type) 
    {
        this.type = type;
    }

    public char getGender() 
    {
        return gender;
    }

    public void setGender(char gender) 
    {
        this.gender = gender;
    }
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
        return "Animal [type= " + type + ", age= " + age + ", gender= " + gender + "]";
    }

}
