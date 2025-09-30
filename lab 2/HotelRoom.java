// Student Name 	: Kobi Bourne 
// Student Id Number: C00XXXXXX
// Date 			: Sept-30-2025
// Purpose 			: My second class implementation
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


    //(roomNumber, roomType, occupied, rate) 

    public int getRoomNum()  //getter
    {
        return roomNum;
    }
    public void setRoomNum(int roomNum) //setter
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
    public boolean getOccupied()
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

    public String toString()
    {
        return "HotelRoom [room number= " + roomNum + ", room type= " + roomType + ", occupied= " + occupied + ", rate= " + rate + "]";
    }

    public void isOccupied()
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

    