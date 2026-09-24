import java.util.Scanner;
public class uklempat {
   
        static double volumeTabung(double r, double t) {
        return Math.PI * r * r * t;
    }

    static void programVolumeTabung(Scanner input) {
        System.out.println(" PROGRAM VOLUME TABUNG");
        System.out.print("Masukkan jari-jari tabung (cm): ");
        double r = input.nextDouble();

        System.out.print("Masukkan tinggi tabung (cm): ");
        double t = input.nextDouble();

        System.out.println("Volume tabung = " + volumeTabung(r, t) + " cm^3");
    }
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        programVolumeTabung(input);
    }
}

   