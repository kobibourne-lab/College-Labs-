
// Student Name 	: Kobi Bourne 
// Student Id Number: C00XXXXXX
// Date 			: 23-11-2025
// Purpose 			: super abstract class person1
public abstract class Person1
{
    //vars
    private String name;

    //constructors
    public Person1(String name)
    {
        this.name = name;
    }

    //get
    public String getName()
    {
        return name;
    }
    
    //abstract method
    public abstract String getDescription();
    
}
