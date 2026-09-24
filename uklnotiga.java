import java.util.Scanner;

public class uklnotiga {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Selamat datang di Kuis Matematika!");
        System.out.println("Kuis ini melibatkan perkalian (*), pembagian (/), dan modulus (%).");
        System.out.println("Jawablah pertanyaan yang muncul. Program akan berhenti jika Anda ingin menghentikan.");
        
        String[] operators = {"*", "/", "%"};
        
        while (true) {
        
            int opIndex = (int) (Math.random() * operators.length);
            String operator = operators[opIndex];
            
           
            int num1 = (int) (Math.random() * 10) + 1;              
            int num2 = (int) (Math.random() * 10) + 1; 
            
            
            if (operator.equals("/") && operator.equals("%")) {
                while (num2 == 0) {
                    num2 = (int) (Math.random() * 10) + 1;
                }
            }
            
           
            double correctAnswer;
            if (operator.equals("*")) {
                correctAnswer = num1 * num2;
            } else if (operator.equals("/")) {
                correctAnswer = (double) num1 / num2; 
            } else { 
                correctAnswer = num1 % num2;
            }
            
            
            System.out.println("" + num1 + " " + operator + " " + num2 + " = ");
            
            
            System.out.print("Jawaban Anda: ");
            double userAnswer = 0;
            while (!scanner.hasNextDouble()) {
                System.out.println("Input tidak valid. Harap masukkan angka.");
                System.out.print("Jawaban Anda: ");
                scanner.next(); 
            }
            userAnswer = scanner.nextDouble();
            scanner.nextLine(); 
            
            
            if (Math.abs(userAnswer - correctAnswer) < 1e-6) {
                System.out.println("Benar!");
            } else {
                System.out.println("Salah! Jawaban yang benar adalah " + correctAnswer);
            }
            
           
            System.out.print("Apakah Anda ingin melanjutkan kuis? (ya/tidak): ");
            String lanjut = scanner.nextLine().toLowerCase();
            if (!lanjut.equals("y")) {
                System.out.println("Terima kasih telah bermain!");
                break;
            }
        }
        

    }
}
