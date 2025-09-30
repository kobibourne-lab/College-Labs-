// Student Name 	: Kobi Bourne 
// Student Id Number: C00XXXXXX
// Date 			: Sept-30-2025
// Purpose 			: My second driver using class
public class Lab2q4 
{
     public static void main(String[]args)
    {

        HotelRoom roomA = new HotelRoom();

        roomA.setRoomNum(200);
        roomA.setRoomType("single");
        roomA.setOccupied(false);
        roomA.setRate(100);

        HotelRoom roomB = new HotelRoom(201, "double");
        roomB.setOccupied(true);
        roomB.setRate(80);

        HotelRoom roomC = new HotelRoom(202, "single", true, 90);

        System.out.println(roomA.toString());
        System.out.println(roomB.toString());
        roomB.isOccupied();
        System.out.println(roomB.toString());
        System.out.println(roomC.toString());
        
        
        

    }
}
