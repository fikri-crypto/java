import java.util.Scanner;

public class latsatu {
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan total uang anda:");
        Double uang = input.nextDouble();
        Double diskon = 0.0;

        if(uang >= 50.000) {
            diskon = uang * 0.5;}
            else {
                diskon = 0.0;
            }
            Double TotalHarga = uang - diskon;
            System.out.println("Total harga anda adalah " + TotalHarga);
        }
                
    }
    
    