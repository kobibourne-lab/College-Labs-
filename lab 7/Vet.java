// Student Name 	: Kobi Bourne 
// Student Id Number: C00XXXXXX
// Date 			: Nov-15-2025
// Purpose 			: My vet subclass
public class Vet
{

//vars
    private String name;

//constructor
    public Vet(String name) 
    {
        this.name = name;
    }


//methods
    public void vaccinate(Animal animal) 
    {
        System.out.println("[ " + name + "] is vaccinating ");
       
        if(animal instanceof Dog)
            {
                System.out.println("Dog has been vaccinated: " + animal.toString());
            }
        else if(animal instanceof Cat)
            {
                System.out.println("Cat has been vaccinated: " + animal.toString());
            }
    }
    
}
