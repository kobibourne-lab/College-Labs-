// Student Name 	: Kobi Bourne 
// Student Id Number: C00XXXXXX
// Date 			: Sept-30-2025
// Purpose 			: My second driver using class
public class Lab2q1
{
 
    public static void main(String[]args)
    {

        HotelRoom roomA = new HotelRoom();

        roomA.setRoomNum(200);
        roomA.setRoomType("single");

        HotelRoom roomB = new HotelRoom(201, "double");

        System.out.println("Room Number " + roomA.getRoomNum() + " Room type " + roomA.getRoomType());

         System.out.println("Room Number " + roomB.getRoomNum() + " Room type " + roomB.getRoomType());







    }

}
