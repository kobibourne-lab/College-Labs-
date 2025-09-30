// Student Name 	: Kobi Bourne 
// Student Id Number: C00XXXXXX
// Date 			: Sept-30-2025
// Purpose 			: My second class implementation
public class HotelRoom
{
 
    private int roomNum;  //variables 
    private String roomType; //private- no other class can use these without getters 
    private int vacant;
    private double rate;
    
    public HotelRoom()      //constructer , used for room A
    {
        setRoomNum(0);
        setRoomType("");
    }
    
    public HotelRoom(int roomNum, String roomType) //2nd constructor, used for room B
    {
        setRoomNum(roomNum);
        setRoomType(roomType);
    }

    public HotelRoom(int roomNum, String roomType, int vacant, double rate) //3nd constructor, used for room C
    {
        setRoomNum(roomNum);
        setRoomType(roomType);
        setVacant(vacant);
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
    public int getVacant()
    {
        return vacant;
    }
    public void setVacant(int vacant)
    {
        this.vacant = vacant;
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
        return "HotelRoom [room number= " + roomNum + ", room type= " + roomType + ", vacant= " + vacant + ", rate= " + rate + "]";
    }

}   

    