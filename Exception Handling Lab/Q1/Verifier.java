// Student Name 	: Kobi Bourne 
// Student Id Number: C00XXXXXX
// Date 			: 20-01-2026
// Purpose 			: 

/*  You should create a class called Verifier which contains:
o one attribute of type MyOutOfRangeException
o one method called verifyIntRange() which takes three integer
parameters: value, low, high.
o If value is not between low and high then the method should
throw the MyOutOfRangeException. */
public class Verifier 
{
    public static void verifyIntRange(int enteredInt, int low, int high) throws MyOutOfRangeException
    {
        if(enteredInt < low || enteredInt > high)
            { 
                throw new MyOutOfRangeException("Entered Int is not in range 1-100");
            }
        else
            {
                System.out.println("Int is in range ");
            }
    }
    
}
