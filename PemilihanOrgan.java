import java.util.Scanner;
public class PemilihanOrgan {
    public static void main(String[] args) {
        System.out.println(" List Pemilihan Organisasi di Moklet ");
        System.out.println("1. OSIS");
        System.out.println("2. MPK");
        System.out.println("3. Dewa Ambalan");
        System.out.println("===============");
        Scanner input = new Scanner (System.in);
        System.out.println(" Silakan pilih organisasi yang ingin diikuti (1-3) : ");
        int pilOrg = input.nextInt();
        switch (pilOrg) { 
            case 1:
            System.out.println(" Silakan masuk ke ruangan gabungan untuk seleksi ");
            break;
            case 2 : 
            System.out.println("Silakan menuju ke Wikuhub unutk seleksi ");
            break;
            case 3:
            System.out.println(" Silakan menuju ke lapangan manatahan untuk seleksi ");
            default:
            break; 
        }



    }
    
}
