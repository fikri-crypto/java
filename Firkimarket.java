import java.util.Scanner;

public class Firkimarket {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("1. Makanan Anjay");
        System.out.println("2. Makanan uhuy");
        System.out.println("3. Makanan yuhuu");
        System.out.println("4. Makanan Cihuy");

        System.out.println("Makanan manaa");
        int pilihan  = input.nextInt();

        System.out.println("Jumlah = ");
       int jumlah = input.nextInt(); 
       
       
       
       
        int harga = 0; 


        switch (pilihan) {
            case 1:
            harga = 9500;
            break; 
            case 2:
            harga = 10000;
            break;
            case 3: 
            harga = 15000;
            break; 
            case 4: 
            harga = 20000;
            break; 
            default:
            System.out.println(" PIlihan tidak ada");
            System. exit(0);

        }

            int total = harga*jumlah;
            System.out.println("Total harga pesaanan adalah "+ total);

            System.out.println("uang yang dibayar = ");
            double Total = input.nextDouble(); 
            
            

        }

    }
    

