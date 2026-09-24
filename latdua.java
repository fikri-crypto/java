import java.util.Scanner;

public class latdua {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Masukkan tahun berapa sekarang : ");
        int tahun = input.nextInt();
        if ( tahun % 4 == 0 || tahun % 400 == 0 ) {
            System.out.println(" tahun ini adalah tahun kabisat ");
        }    
        else { 
            System.out.println("");
        }
}
}
