import java.util.Scanner;
public class PerulanganForr {
    public static void main(String[] args) {
        // Perulangan mundur dari 100 ke 0
        for (int hitungan = 100; hitungan >= 0; hitungan--) {
            System.out.print(hitungan + " ,");
        }
        System.out.println();

        // Input awal dan akhir
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai awal: ");
        int awal = input.nextInt();
        System.out.print("Masukkan nilai akhir: ");
        int akhir = input.nextInt();
        int temp = 0;

        // Perulangan maju dari awal ke akhir, kelipatan 2
        for (int i = awal; i < akhir; i += 2) {.
            temp += i;
            System.out.print(i + ",");
        }

        System.out.println();
        System.out.println("Total deret tersebut adalah " + temp);

        input.close();
    }
    
}
