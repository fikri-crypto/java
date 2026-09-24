import java .util.Scanner;

public class KategoriUsia {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan usia anda ");
        int usia = input.nextInt(); 
        if( usia >= 5 && usia <= 9) {
            System.out.println("Anda masih anak-anak");
        } else if(usia >= 10 && usia <= 18) {
            System.out.println("Anda remaja");
        } else if(usia >= 18 && usia <= 59) {
            System.out.println("Anda dewasa");
        } else{ System.out.println("Anda tidak masuk kategori usia:awokawokaowkoaowkaokw");}
        }
    }
    
  