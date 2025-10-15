
public class Employee 

{
    
    private String manager;
    private String staff;
    private String name;
    private String id;



    //constructors 
public Employee(String street, String city, String county)
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

    







