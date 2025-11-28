// Student Name 	: Kobi Bourne 
// Student Id Number: C00XXXXXX
// Date 			: 23-11-2025
// Purpose 			: Book class extending LibraryItem 
public class Book extends LibraryItem implements LoanItem
{
    //vars
    private String author;
    private String title;
    private int numPages;
    
    //constructor
    public Book(String type, String ID, String author, String title, int numPages) 
    {
        super(type, ID);
        this.author = author;
        this.title = title;
        this.numPages = numPages;
    }

    //gets && sets
    public String getAuthor() 
    {
        return author;
    }

    public void setAuthor(String author) 
    {
        this.author = author;
    }

    public String getTitle() 
    {
        return title;
    }

    public void setTitle(String title) 
    {
        this.title = title;
    }

    public int getNumPages() 
    {
        return numPages;
    }

    public void setNumPages(int numPages) 
    {
        this.numPages = numPages;
    }
    
    //price method
    @Override
    public double calculatePrice() 
    {
        return numPages * 0.05;  
    }

    //toString
    @Override
    public String toString() 
    {
        return super.toString() +  "\n[author= " + author + ", title= " + title + ", numPages= " + numPages + " price= " + calculatePrice() + "]";
    }

    










    


    
}
