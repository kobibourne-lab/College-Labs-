
public class TestPerson 
{
public static void main(String[] args)
{
    int index;
    index = 0;
    Person1[] people = new Person1[2];
    people[0] = new Employee1("Jack", 50000.0);
    people[1] = new Employee1("Nate", 75000.0);

    for( index = 0; index < people.length; index++)
        {
            System.out.println("Name: " + people[index].getName() + "Description: " + people[index].getDescription());
            System.out.println();
        }

}
}