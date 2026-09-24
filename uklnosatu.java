import java.util.Scanner;

public class uklnosatu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" masukkan bilangan = ");
        double bil = input.nextDouble();

        boolean prima = bil > 1;

       for(int i = 2; i * i <= bil; i++){
       if(bil % i == 0){
        prima = false;
        break;
        
    }
         }
    
         if(prima){
          System.out.println(bil + " adalah bilangan prima");
         } else {
          System.out.println(bil + " bukan bilangan prima");
         }
     }
    }
    



       