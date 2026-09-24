import java.util.Scanner; 
public class Nilai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nilai anda ");
        int nilai = input.nextInt(); 
        if( nilai >= 0 && nilai <= 54) {
            System.out.println("Nilai anda D");
        } else if(nilai >= 55 && nilai <= 59) {
            System.out.println("Nilai anda D+");
        } else if(nilai >= 60 && nilai <= 64) {
            System.out.println("Nilai anda C-");
        } else if(nilai >= 65 && nilai <= 69) {
            System.out.println("Nilai anda C");
        } else if(nilai >= 70 && nilai <= 74) {
            System.out.println("Nilai anda C+");
        } else if(nilai >= 75 && nilai <= 80) {
            System.out.println("Nilai anda B-");
        } else if(nilai >= 81 && nilai <= 85) {
            System.out.println("Nilai anda B");
        } else if(nilai >= 86 && nilai <= 90) {
            System.out.println("Nilai anda B+");
        } else if(nilai >= 91 && nilai <= 95) {
            System.out.println("Nilai anda A-");
        } else if(nilai >= 96 && nilai <= 100) {
            System.out.println("Nilai anda A");
        } else { 
            System.out.println("Nilai tidak valid");
          Scanner masuk = new Scanner (System.in);
          System.out.println("Masukkan Predikat Nilai Anda");
          String predikat = masuk.nextLine();
          switch (predikat) {
            case "A" :
                System.out.println("Sangat Baik");
                
                break;
          
            default:
                break;
          } 
        }
    }
    
}
