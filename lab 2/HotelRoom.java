public class HotelRoom
{
 
    private int roomNum;  //variables 
    private String roomType; //private- no other class can use these without getters 

    
    public HotelRoom()      //constructer 
    {
        setRoomNum(0);
        setRoomType("unk");
    }
    
    public HotelRoom(int roomNum, String roomType) //2nd constructor
    {
        setRoomNum(roomNum);
        setRoomType(roomType);
    }

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



}   

    