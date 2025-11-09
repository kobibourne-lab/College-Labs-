// Student Name 	: Kobi Bourne 
// Student Id Number: C00XXXXXX
// Date 			: 09-11-2025
// Purpose 			: Teacher class

import java.util.Arrays;

public class Teacher extends Person
{

    private int numCourses; 
    private String[] courses;
    private static final int MAXCOURSES = 5;
    
    public Teacher(String name, String address)
    {
        super(name, address);
        this.numCourses = 0;
        this.courses = new String[MAXCOURSES];
    }

    public boolean addCourse(String course)
    {
        for(int i = 0; i < numCourses; i++)
            {
                if(courses[i] == course)
                    {
                        return false;
                    }
                
            else
                {
                    courses[numCourses]=course;
                    numCourses++;
                }    
            }
        return true;
    }
    
    public boolean removeCourse(String course) 
    {
        for (int i = 0; i < numCourses; i++) 
            {
                if (courses[i] == course) 
                    {
                        // Shift remaining courses left
                        for (int j = i; j < numCourses - 1; j++) 
                            {
                                courses[j] = courses[j + 1];
                            }
                        courses[numCourses - 1] = null; // Clear last
                        numCourses--;
                        return true;
                    }
            }
        return false; // Course not found
    }

    @Override
    public String toString() {
        return "Teacher [numCourses=" + numCourses + ", courses=" + Arrays.toString(courses) + "]";
    }
    





}
