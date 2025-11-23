
public class Student1 extends Person1
{

    private String course;

    public Student1(String name, String course)
    {
        super(name);
        this.course = course;
    }

    @Override 
    public String getDescription()
    {
        return " A student studying " + course;
    }
    
}
