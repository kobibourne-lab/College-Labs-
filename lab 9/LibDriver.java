// Student Name 	: Kobi Bourne 
// Student Id Number: C00XXXXXX
// Date 			: 28-11-2025
// Purpose 			: driver class LibDriver
//import java.util.Arrays;

public class LibDriver 
{
    public static void main(String[] args) 
    {
        
        //array of 2 Library Items
        LibraryItem[] libItems = new LibraryItem[2];    
        
        //book object made
        Book book1 = new Book("book", "001", "Shamus H", "Like a River", 375);

        //cd object made
        CD cd1 = new CD("CD", "1001", "The Roots", "Phrenology", 16);
        
        libItems[0] = book1;      //load book1 one into array pos 0


        libItems[1] = cd1;        //load cd1 one into array pos 1

        cd1.calculatePrice();                       //call price method on cd1
        System.out.println(cd1.calculatePrice());   //print price
        System.out.println(libItems[0]);            //print array pos 0 = book1 info

        book1.calculatePrice();                     //call price method on book1
        System.out.println(book1.calculatePrice());       //print price 
        System.out.println(libItems[1]);

        //System.out.println(Arrays.toString(libItems));
                                                            //OTHER WAYS TO PRINT
       // for(int index = 0; index < libItems.length; index++)
           // {
              //  System.out.println(libItems[index]);
           // }

        
        
    }
}