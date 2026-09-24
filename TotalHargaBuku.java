import java.util.Scanner;

public class TotalHargaBuku {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double hargaBuku , totalHargaBuku = 0;
        boolean kondisi= true;
        while(kondisi) {
            System.out.println(" Masukkan Harga Buku");
            hargaBuku = input.nextDouble();
            totalHargaBuku += hargaBuku;
            if(hargaBuku==0){
                kondisi=false;
            }   
        
        }
        System.out.println("Total Harga Keseluruhan"+ totalHargaBuku);

    }
    
    
}
