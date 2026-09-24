import java.util.Scanner;

public class uklnolima {
public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int BATASKEMENANGAN = 5;
        int skorPemain = 0;
        int skorKomputer = 0;
        int nyawaPemain = 3;
        int nyawaKomputer = 3;
       

        
        int riwayatP[] = new int[100]; 
        int riwayatK[] = new int[100];
        int idx = 0; 
        

        System.out.println("--- Lempar Dadu ---");
        System.out.println("Goal: " + BATASKEMENANGAN + " kemenangan.");
        System.out.println("-------------------");

        while (skorPemain < BATASKEMENANGAN && skorKomputer < BATASKEMENANGAN) {
            
            System.out.print("Tekan ENTER untuk lempar... ");
            input.nextLine();

            
            int daduK = (int) (Math.random() * 6) + 1;
            int daduP = (int) (Math.random() * 6) + 1;
            
           
            if (idx < 100) {
                riwayatK[idx] = daduK;
                riwayatP[idx] = daduP;
                idx++;
            }

            System.out.println("Komp: " + daduK + " | Anda: " + daduP);

            
            String hasil;
            if (daduP > daduK) {
                hasil = "Anda menang!";
                skorPemain++;
                nyawaKomputer--;
            } else if (daduK > daduP) {
                hasil = "Komp menang.";
                skorKomputer++;
                nyawaPemain--;
                
            } else {
                hasil = "Seri.";
            }
            
            System.out.println("Hasil: " + hasil);
            System.out.println("Skor: P-" + skorPemain + " K-" + skorKomputer + "\n");
            System.out.println(" nyawa Anda: " + nyawaPemain + " | nyawa Komp: " + nyawaKomputer);
            if ( skorPemain == 0) {
                System.out.println("Anda kehabisan nyawa! Komputer menang.");
                break;
            } else if ( skorKomputer == 0) {
                System.out.println("Komp kehabisan nyawa! Anda menang.");
                break;
            }
        }

        input.close();

        
        System.out.println("--- PERMAINAN SELESAI ---");
        String pemenang = (skorPemain > skorKomputer) ? "PEMAIN" : "KOMPUTER";
        System.out.println("Pemenangnya adalah **" + pemenang + "**!");
        System.out.println("Skor Akhir: " + skorPemain + " - " + skorKomputer);

        
        System.out.println("\n**Riwayat Lemparan Komputer:**");
        tampilkanRiwayat(riwayatK, idx);
        
        System.out.println("\n**Riwayat Lemparan Pemain:**");
        tampilkanRiwayat(riwayatP, idx);
    }
    
    
    public static void tampilkanRiwayat(int arr[], int count) {
        System.out.print("[");
        for (int i = 0; i < count; i++) {
            System.out.print(arr[i]);
            if (i < count - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}

