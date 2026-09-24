import java.util.Scanner;

public class soalukldua {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("PROGRAM FAKTORIAL");
        System.out.print("Masukkan bilangan bulat positif: ");
        int n = input.nextInt();

        if (n < 0) {
            System.out.println("Bilangan harus positif!");
            return;
        }

         long hasil = 1;
        for (int i = 1; i <= n; i++) {
            hasil = i;
        }

        System.out.println("Faktorial dari " + n + " adalah: " + hasil);
    }
            
        }
        

