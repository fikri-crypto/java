import java.util.Scanner;

public class InputanData {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Nama Siswa:");
        String nama = input.nextLine();
        int usia = input.nextInt();
        System.out.println("Berat badan :");
        double beratBadan = input.nextDouble();

        System.out.println("Hai, "+ nama);
        System.out.println("Usia  " + nama + " adalah " + usia );
        System.out.println("Berat badan  adalah " + beratBadan );
        

        
    }
}

        