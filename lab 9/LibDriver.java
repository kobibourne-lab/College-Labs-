
public class LibDriver 
{
    public static void main(String[] args) 
    {
    
        LibraryItem[] libItems = new LibraryItem[2];
        Book book1 = new Book("book", "001", "Shamus H", "Like a River", 375);
        CD cd1 = new CD("CD", "1001", "The Roots", "Phrenology", 16);
        libItems[0] = book1;
        libItems[1] = cd1;

        cd1.calculatePrice();
        System.out.println(cd1.toString());
        System.out.println(libItems[0]);

        book1.calculatePrice();
        System.out.println(book1.toString());
        System.out.println(libItems[1]);


        for(int index = 0; index < libItems.length; index++)
            {
                System.out.println(libItems[index]);
            }

        
        
    }
}