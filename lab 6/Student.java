// Student Name 	: Kobi Bourne 
// Student Id Number: C00XXXXXX
// Date 			: 09-11-2025
// Purpose 			: Student class
import java.util.Arrays;
public class Student extends Person
{
    //variables 
    private int numCourses;
    private String[] courses;
    private int[] grades;
    private static final int MAXCOURSE=5;
    
    public Student(String name, String address) 
    {
        super(name, address);
        numCourses = 0;
        courses = new String[MAXCOURSE];
        grades = new int[MAXCOURSE];

    }

    
    public void addCourseGrade (String course, int grade)
    {
        if(numCourses < MAXCOURSE)
            {
                courses[numCourses] = course;
                grades[numCourses] = grade;
                numCourses++;
            }
        else
            {
                System.out.println(" can't add anymore courses ");
            }
    }


    public void printGrades ()
    {
        System.out.println(this ); //"Student " + getName() - wont work
        for(int i = 0; i < numCourses; i++)
            {
                System.out.println("Course: " + courses[i] + " Grade: " + grades[i]);
            }
        
    }

    public double getAverageGrade()
    {
        int sum = 0;
        double average = 0.0;
        for(int i = 0; i < numCourses; i++ )
            {
                sum = sum + grades[i];
            }
        average = sum / numCourses;
        return average;
    }

    public String toString() 
    {
        return "Student [toString()=" + super.toString() + "courses" + Arrays.toString(courses) +  "grades" + Arrays.toString(grades) + "]";
    }

}
