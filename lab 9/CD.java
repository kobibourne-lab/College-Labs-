
public class CD extends LibraryItem implements LoanItem

{

    String band;
    String title;
    int numTracks;
    
    public CD(String type, String ID, String band, String title, int numTracks) 
    {
        super(type, ID);
        this.band = band;
        this.title = title;
        this.numTracks = numTracks;
    }

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

    public double calculatePrice() 
    {
        return numTracks * 0.50;  
    }

    @Override
    public String toString() 
    {
        return super.toString() +   "CD [band=" + band + ", title=" + title + ", numTracks=" + numTracks + "]";
    }















    
}
