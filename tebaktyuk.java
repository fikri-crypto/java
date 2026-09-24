import java.util.Scanner;

public class tebaktyuk {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int Angkarahasia = 10;
        boolean kondisi = true;
        int tebakan;
        int counter = 0; 
        System.out.println(" pilih angka dari 1- 20 ");
do {
    System.out.println("masukkan tebakan anda");
    tebakan = input.nextInt(); 
    counter++;
    
    if(tebakan == Angkarahasia ) { 
        System.out.println(" Tebakan Anda Benarrr, YYYEYYY");
        kondisi = false; 
    }else {
        System.out.println(" Yahhh salahhh");
    }
}    while (kondisi);
System.out.println(" Anda sudah menebak sebanyak"+ counter + "kali");    
    }
}
