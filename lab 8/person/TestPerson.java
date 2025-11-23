// Student Name 	: Kobi Bourne 
// Student Id Number: C00XXXXXX
// Date 			: 23-11-2025
// Purpose 			: driver class 
public class TestPerson 
{
public static void main(String[] args)
{
    int index;
    index = 0;
    Person1[] people = new Person1[2];  //array
    people[0] = new Employee1("Jack", 50000.0);//emp object
    people[1] = new Student1("Nate", "Maths");//student object

    for( index = 0; index < people.length; index++) // loop for printing 
        {
            System.out.println("Name: " + people[index].getName() + "\nDescription: " + people[index].getDescription());// calls getName and Description on both elemnets in array
            System.out.println();
        }

}
}