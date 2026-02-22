// Student Name 	: Kobi Bourne 
// Student Id Number: C00XXXXXX
// Date 			: 20-02-2026
// Purpose 			: 

public class VerifyRangeTest2 
{

    public static void main(String[] args) 
    {

        //Write a program called VerifyRangeTest which will read in an integer
        //from the keyboard and then check that it is within a certain range e.g. 1-100.
        //If it is not then it should display an appropriate message to the user.
        int high;
        int low;
        int enteredInt;
        String password;

        high = 100;
        low = 1;
        while(true)
        {
            System.out.println(" Please Enter an integer within range 1-100 ");
            enteredInt = EasyIn.getInt();

            try
                {
                    Verifier2.verifyIntRange(enteredInt, low, high);
                }

            catch(MyOutOfRangeException2 e)
                {
                    e.printStackTrace();
                }

       
            System.out.println(" Please Enter the password ");
            password = EasyIn.getString();

            try
                {
                    Verifier2.verifyPasswordStrength(password);
                }

            catch(MyInvalidPasswordException e)
                {
                    e.printStackTrace();
                }

        }
        

    }
}
