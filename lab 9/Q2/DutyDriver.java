// Student Name 	: Kobi Bourne 
// Student Id Number: C00XXXXXX
// Date 			: 23-11-2025
// Purpose 			: Driver class
public class DutyDriver 
{
    public static void main(String[] args) 
    {
        Car1 car1 = new Car1("Ford", 4, 4 , 20000); //make Car1 object

        Hgv1 hgv1 = new Hgv1("Coal", 8, 2, 50000);  //make hgv1 object

        System.out.println(hgv1.toString()); //print before calculateDuty called 
        
        System.out.println(car1.toString()); //print before calculateDuty called

        System.out.println("Car import duty: " + car1.calculateDuty()); //print import duty on car

        System.out.println("HGV import duty: " + hgv1.calculateDuty()); //print import duty on hgv

        System.out.println(car1.toStringD());        //prints car info after duty added       

        System.out.println(hgv1.toStringD());      //prints hgv info after duty added 

    }

    
}
