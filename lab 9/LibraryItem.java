// Student Name 	: Kobi Bourne 
// Student Id Number: C00XXXXXX
// Date 			: 28-11-2025
// Purpose 			: super class LibraryItem 
public abstract class LibraryItem 
{

    private String type;
    private String ID;
    
    public LibraryItem(String type, String iD) 
    {
        this.type = type;
        this.ID = iD;
    }

    public String getType() 
    {
        return type;
    }

    public void setType(String type) 
    {
        this.type = type;
    }

    public String getID() 
    {
        return ID;
    }

    public void setID(String iD)
    {
        this.ID = iD;
    }

    @Override
    public String toString() 
    {
        return "LibraryItem [type = " + type + ", ID = " + ID + "]";
    }

    
    









    
}

