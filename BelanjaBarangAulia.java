import java.util.Scanner;

public class BelanjaBarangAulia {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.print("Nama Barang1: ");
        String barang1 = input.nextLine();
        System.out.print("Harga Barang1: ");
        double harga1 = input.nextDouble();
        
        System.out.print("Nama Barang2: ");
        String barang2 = input.nextLine();
        System.out.print("Harga Barang2: ");
        double harga2 = input.nextDouble();

        System.out.println("=========================================");
        System.out.println("Barang yang dibeli:" + barang1 + " dan " + barang2);
        System.out.println("Harga: " + harga1 + " dan " + harga2);

       
    }
}
