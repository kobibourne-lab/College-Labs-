// Student Name 	: Kobi Bourne 
// Student Id Number: C00XXXXXX
// Date 			: Sept-30-2025
// Purpose 			: My first driver using class hotel room 
public class Lab2q1
{
 
    public static void main(String[]args)
    {

        HotelRoom roomA = new HotelRoom();           //using default constructor , instance of hotel room class

        roomA.setRoomNum(200);                  //calls setter method , sets room number
        roomA.setRoomType("single");           //sets room type 

        HotelRoom roomB = new HotelRoom(201, "double");      //using second constructor , instance of hotel room class, 2 parameters loaded into constructer 

        System.out.println("Room Number " + roomA.getRoomNum() + " Room type " + roomA.getRoomType());  //prints room a number and type 

         System.out.println("Room Number " + roomB.getRoomNum() + " Room type " + roomB.getRoomType());

    }

}
