// Student Name 	: Kobi Bourne 
// Student Id Number: C00XXXXXX
// Date 			: Sept-30-2025
// Purpose 			: My 4th driver using hotelroom
public class Lab2q4 
{
     public static void main(String[]args)
    {

        HotelRoom roomA = new HotelRoom();          //using default constructor , instance of hotel room class 
                                                    //calling setters
        roomA.setRoomNum(200);              //sets room number
        roomA.setRoomType("single");       //sets room type
        roomA.setOccupied(false);          // sets occupied status 
        roomA.setRate(100);                    //sets rate 

        HotelRoom roomB = new HotelRoom(201, "double");     //using second constructor, takes 2 parameters, instance of hotel room class
        roomB.setOccupied(true);                                    //sets occupied status 
        roomB.setRate(80);                                              //sets rate 

        HotelRoom roomC = new HotelRoom(202, "single", true, 90);   //using third constructor , takes 4 parameters, instance of hotel room class

        System.out.println(roomA.toString());   //calls toString method , prints roomA details
        System.out.println(roomB.toString());
        roomB.isOccupied();                    //trys to set b room to occupied again, cant double book
        System.out.println(roomB.toString());   //prints fail message and prints b info
        System.out.println(roomC.toString());
        
        
        

    }
}
