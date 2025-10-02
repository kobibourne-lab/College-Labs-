// Student Name 	: Kobi Bourne 
// Student Id Number: C00XXXXXX
// Date 			: Sept-30-2025
// Purpose 			: third driver using class
public class Lab2q3 
{
     public static void main(String[]args)
    {

        HotelRoom roomA = new HotelRoom();             //using default constructor , instance of hotel room class

        roomA.setRoomNum(200);               //sets room number
        roomA.setRoomType("single");        //sets room type 
        roomA.setOccupied(true);            // sets occupied status 
        roomA.setRate(100);                     //sets rate

        HotelRoom roomB = new HotelRoom(201, "double");             //using second constructor, takes 2 parameters, instance of hotel room class
        roomB.setOccupied(false);                                           // sets occupied status 
        roomB.setRate(80);                                                      // sets rate  

        HotelRoom roomC = new HotelRoom(202, "single", false, 90);   //using third constructor , takes 4 parameters, instance of hotel room class

        System.out.println(roomA.toString());       //calls toString , prints room a info 
        System.out.println(roomB.toString());
        System.out.print(roomC.toString());


    }
}
