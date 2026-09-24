import java.util.Scanner;

public class soalmpat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Berapa banyak angka yang ingin dimasukkan? ");
        int angka = input.nextInt();

        int[] array = new int[angka];

        System.out.println("Masukkan angkanya satu per satu:");
        for (int i = 0; i < angka; i++) {
            array[i] = input.nextInt();
        }

        boolean adaDuplikat = false;
        System.out.println("\nAngka yang sama (duplikat):");

        for (int i = 0; i < angka; i++) {
            int count = 0;
            boolean sudahDihitung = false;
            
            for (int j = 0; j < angka; j++) {
                if (array[i] == array[j]) {
                    count++;
                }
            }
            
            
            for (int k = 0; k < i; k++) {
                if (array[i] == array[k]) {
                    sudahDihitung = true;
                    break;
                }
            }
            
            if (count > 1 && !sudahDihitung) {
                System.out.println("Angka " + array[i] + " muncul " + count + " kali");
                adaDuplikat = true;
            }
        }

        if (!adaDuplikat) {
            System.out.println("Tidak ada angka yang sama.");
        }

        input.close();
    }
}


    
