import java.util.Scanner;

public class sdgsatu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan bilangan :");
        int bil = input.nextInt();
        int tem = 1;
        for(int i = bil; i > 0; i--) {
            System.out.print(i+" ");
            tem*=i;
        }
System.out.println();
    System.out.println("Hasil Faktorial " + tem);
    }
    
            
}
