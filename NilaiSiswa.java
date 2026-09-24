import java.util.Scanner;

public class NilaiSiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nama Siswa: ");
        int jumlahsiswa = input.nextInt();
        int Temp = 0;

        
        for (int i = 0; i < jumlahsiswa; i++) {
            System.out.print("Masukkan nilai siswa ke-" + (i + 1) + ": ");
            int nilai = input.nextInt();
            Temp += nilai;
        }
        
        System.out.println("Rata-rata nilai siswa adalah: "+ (Temp/jumlahsiswa));
    }

    
}
