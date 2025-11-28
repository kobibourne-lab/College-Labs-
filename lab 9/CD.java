// Student Name 	: Kobi Bourne 
// Student Id Number: C00XXXXXX
// Date 			: 23-11-2025
// Purpose 			: CD class extending LibraryItem 
public class CD extends LibraryItem implements LoanItem

{
    //vars
    private String band;
    private String title;
    private int numTracks;
    
    //constructor
    public CD(String type, String ID, String band, String title, int numTracks) 
    {
        super(type, ID);
        this.band = band;
        this.title = title;
        this.numTracks = numTracks;
    }

    //gets && sets
    public String getBand() 
    {
        return band;
    }
    public void setBand(String band) 
    {
        this.band = band;
    }

    public String getTitle() 
    {
        return title;
    }

    public void setTitle(String title) 
    {
        this.title = title;
    }
    
    public int getNumTracks() 
    {
        return numTracks;
    }
    
    public void setNumTracks(int numTracks) 
    {
        this.numTracks = numTracks;
    }

    //price method
    @Override
    public double calculatePrice() 
    {
        return numTracks * 0.50;  
    }
    //toString
    @Override
    public String toString() 
    {
        return super.toString() +   " \n[band= " + band + ", title= " + title + ", numTracks= " + numTracks + " price= " + calculatePrice() + "]";
    } 
    
}
