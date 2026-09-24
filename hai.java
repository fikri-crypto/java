
    import java.util.Scanner; 
public class hai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nilai anda ");
        int nilai = input.nextInt(); 
        String kategori;

        switch (nilai / 10) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                if (nilai >= 0 && nilai <= 54) {
                    kategori = "D";
                } else if (nilai >= 36 && nilai <= 55) {
                    kategori = "D+";
                } else {
                    kategori = "Nilai tidak valid";
                }
                break;
            case 6:
                kategori = "C";
                break;
            case 7:
            case 8:
                if (nilai <= 85) {
                    kategori = "B";
                } else {
                    kategori = "Nilai tidak valid";
                }
                break;
            case 9:
            case 10:
                if (nilai >= 96 && nilai <= 100) {
                    kategori = "A";
                } else {
                    kategori = "Nilai tidak valid";
                }
                break;
            default:
                kategori = "Nilai tidak valid";
        }

        System.out.println("Nilai anda " + kategori);
    }
}

