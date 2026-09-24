import java.util.Scanner;

public class uklganjilgenap {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
    
    System.out.println("\n=== PROGRAM GANJIL / GENAP ===");
        System.out.print("Masukkan bilangan: ");
        int bil = input.nextInt(); 

        if (bil % 2 == 0) {
            System.out.println(bil + " adalah bilangan GENAP.");
        } else {
            System.out.println(bil + " adalah bilangan GANJIL.");
        }
    }
}

