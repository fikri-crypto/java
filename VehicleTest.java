
public class VehicleTest {
     public static void main(String[] args) {
        Vehicle car = new Vehicle();
        car.print();

        Vehicle truck = new Vehicle("Mercedes", 15);
        truck.print();

        Vehicle bus = new Vehicle();
        bus.setMerk("Hino");
        bus.setLiterPerKilo(100);
        bus.print();
        bus.compare();

        int a = truck.getLiterPerKilo();
        int b = bus.getLiterPerKilo();
        System.out.println(compare1(a, b));
 if(compare1(a, b)==1){
System.out.println(" truck lebih besar");
 } else if (compare1(a,b)==2){
    System.out.println("Bus lebih besar");
 }
    }
public static int compare1(int a, int b) {
    if (a > b) {
        
        return 1;
    } else if (b > a){
        
        return 2; 
    } else {
        return 0;
    }


} 


}
