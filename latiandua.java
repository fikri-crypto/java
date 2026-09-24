import java.util.Scanner;

public class latiandua {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
System.out.println("Masukkan Bilangan");
int bilangan = input.nextInt();

if ( bilangan % 2 == 0) {
    System.out.println( bilangan+ " Adalah Bilangan Genap");
    } else {
    System.out.println( bilangan+ " Adalah Bilangan Ganjil");
    }
    
}
}