// Student Name 	: Kobi Bourne 
// Student Id Number: C00XXXXXX
// Date 			: 23-11-2025
// Purpose 			: Student1 class extending person1
public class Student1 extends Person1
{
    //vars
    private String course;

    //constructor
    public Student1(String name, String course)
    {
        super(name);
        this.course = course;
    }

    //methods
    @Override 
    public String getDescription()
    {
        return " A student studying " + course;
    }
    
}
