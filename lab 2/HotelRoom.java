// Student Name 	: Kobi Bourne 
// Student Id Number: C00XXXXXX
// Date 			: Sept-30-2025
// Purpose 			: My hotel calss for driver programs 
public class HotelRoom
{
 
    private int roomNum;  //variables 
    private String roomType; //private- no other class can use these without getters 
    private boolean occupied;
    private double rate;
    
    public HotelRoom()      //constructer , default 
    {
        setRoomNum(0);
        setRoomType("");
    }
    
   public HotelRoom(int roomNum, String roomType) //2nd constructor, 2 parameters, used for room B
    {
        setRoomNum(roomNum);
        setRoomType(roomType);
    }

    public HotelRoom(int roomNum, String roomType, boolean occupied, double rate) //3nd constructor, used for room C
    {
        setRoomNum(roomNum);
        setRoomType(roomType);
        setOccupied(occupied);
        setRate(rate);
    }

    public int getRoomNum()  //getter for roomNum
    {
        return roomNum;
    }
    public void setRoomNum(int roomNum) //setter for roomNum
    {
       this.roomNum = roomNum; 
    }

    public String getRoomType() //getter
    {
        return roomType;
    }
    public void setRoomType( String roomType) //setter
    {
       this.roomType = roomType; 
    }
    public boolean getOccupied() //boolean method , is occupied true or false 
    {
        return occupied;
    }
    public void setOccupied(boolean occupied)
    {
        this.occupied = occupied;
    }
     public double getRate()
    {
        return rate;
    }
    public void setRate(double rate)
    {
        this.rate = rate;
    }

    public String toString()    //used to print all info for a room 
    {
        return "HotelRoom [room number= " + roomNum + ", room type= " + roomType + ", occupied= " + occupied + ", rate= " + rate + "]";
    }

    public void isOccupied()     //checks room booked , if it is , cannot book again, if not gets booked
    {
        if(occupied)
            {
                System.out.println(" The room is occupied, cannot double book");
            }
        else   
            {
                setOccupied(true);
                System.out.println( " The room is booked and now occupied");
            }      
    }

}   

    