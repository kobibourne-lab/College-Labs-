
public class Book extends LibraryItem implements LoanItem
{

    String author;
    String title;
    int numPages;
    
    public Book(String type, String ID, String author, String title, int numPages) 
    {
        super(type, ID);
        this.author = author;
        this.title = title;
        this.numPages = numPages;
    }

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

    @Override
    public double calculatePrice() 
    {
        return numPages * 0.05;  
    }


    @Override
    public String toString() 
    {
        return super.toString() +  " = [author= " + author + ", title= " + title + ", numPages= " + numPages + " price= " + calculatePrice() + "]";
    }

    










    


    
}
