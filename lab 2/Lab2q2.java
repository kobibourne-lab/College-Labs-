// Student Name 	: Kobi Bourne 
// Student Id Number: C00XXXXXX
// Date 			: Sept-30-2025
// Purpose 			: My second driver using class
public class Lab2q2 
{
     public static void main(String[]args)
    {
        
        HotelRoom roomA = new HotelRoom();      //using default constructor , instance of hotel room class

        roomA.setRoomNum(200);               //sets room number
        roomA.setRoomType("single");        //sets room type
        roomA.setOccupied(true);            //sets occupied 
        roomA.setRate(100);                     //sets rate 

        HotelRoom roomB = new HotelRoom(201, "double"); //uses 2nd constructor, can use 4th 
        roomB.setOccupied(false);                               //sets occupied 
        roomB.setRate(80);                                          //sets rate 

        //HotelRoom roomC = new HotelRoom(202, "single", 0, 90);

        System.out.println(roomA.toString());           //calls toString , prints room a info 
        System.out.println(roomB.toString());
        //System.out.print(roomC.toString());


    }
}
