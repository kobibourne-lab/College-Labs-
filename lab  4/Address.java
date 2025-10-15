
public class Address 
{
    
    private String street;
    private String city;
    private String county;



    //constructors 
public Address(String street, String city, String county)
    {
        setStreet(street);
        setCity(city);
        setCounty(county);
    }


    //getters && setters
public String getStreet()
    {
        return street;
    }

public void setStreet( String street)
    {
        this.street = street; 
    }


public String getCounty()
    {
        return county;
    }

public void setCounty( String county)
    {
        this.county = county; 
    }
    
public String getCity()
    {
        return city;
    }

public void setCity( String city)
    {
        this.city = city; 
    }

public String toString()
    {
        return "Address --> Street: " + street + " City: " + city + " County: " + county;
    }






}
