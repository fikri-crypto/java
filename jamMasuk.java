import java.util.Scanner;
public class jamMasuk {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("masukkan jam masuk ");
        int masuk = input .nextInt(); 

        if(masuk > 5){System.out.println("Anda terlamnbat ");}
        else {System.out.println(" Anda tepat waktu ");}
        System.out.println(" terimas kasih ");

        
    }
    
}
