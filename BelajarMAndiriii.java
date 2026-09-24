import java.util.Scanner;

public class BelajarMAndiriii {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        
        System.out.println("Masukkan nilai mtk");
        double mtk = input.nextDouble();

        System.out.println("Masukkan nilai bin");
        double bin = input.nextDouble(); 

        System.out.println("Masukkan nilai big");
        double big = input.nextDouble(); 

        System.out.println("Masukkan nilai agama");
        double agama = input.nextDouble(); 

        System.out.println("Masukkan nilai bjawa");
        double bjawa = input.nextDouble(); 

        double rataRata = mtk+bin+big+agama+bjawa/2;
        System.out.println(" Rata Rata Ulangan = "+ rataRata);
    if  ( rataRata <= 75) 
       {System.out.println(" Anda tidak lulus");}
        else {System.out.println(" Anda lulus"); } 

    }
    
}
