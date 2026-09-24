import java.util.Scanner;

public class While {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in); 
         boolean kondisi = true; 
         int counter = 0; 
         String jawab;

         while(kondisi) {
            System.out.println(" apakah anda ingin mengulang, [ya atau tidak]");
            jawab = input.nextLine(); 

            if(jawab.equalsIgnoreCase("ya")) { 
                kondisi=false;

            }
            counter++;

         }
         System.out.println("Anda telah mengulang sebanyak"+ counter + "kali");
    }
    
}
