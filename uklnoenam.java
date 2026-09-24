import java.util.Scanner;

public class uklnoenam {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.print("Masukkan nama peminjam: ");
        String nama = input.nextLine();

        System.out.print("Masukkan judul buku: ");
        String judul = input.nextLine();

        System.out.print("Masukkan kategori buku (A / B / C): ");
        String kategori = input.next(); 

        System.out.print("Masukkan lama peminjaman (hari): ");
        int lama = input.nextInt();
     

        int tarif = 0;
        int denda = 0;

        
        switch (kategori) {
            case "A":
            case "a":
                tarif = 2000;
                break;

            case "B":
            case "b":
                tarif = 1500;
                break;

            case "C":
            case "c":
                tarif = 1000;
                break;

            default:
                System.out.println("Kategori tidak valid.");
                return;   
        }

        
        int biayaAwal = tarif * lama;

        if (lama > 7) {
            int hariTerlambat = lama - 7;
            denda = hariTerlambat * 500;
        }

        int total = biayaAwal + denda;

    
        System.out.println(" STRUK PEMINJAMAN BUKU ");
        System.out.println("Nama Peminjam        : " + nama);
        System.out.println("Judul Buku           : " + judul);
        System.out.println("Kategori Buku        : " + kategori);
        System.out.println("Lama Peminjaman      : " + lama + " hari");
        System.out.println("Biaya Peminjaman     : Rp " + biayaAwal);
        System.out.println("Denda Keterlambatan  : Rp " + denda);
        System.out.println("Total Biaya Akhir    : Rp " + total);

       
    }
}
