import java.util.Scanner;
public class KonsepIfElse {
    public static void main(String[] args) {
        double berat,tinggi,hasil;
        String bmi;
        Scanner input = new Scanner(System.in);
        System.out.println("inputkan berat badan: (kg)");
        berat = input.nextDouble();  
    System.out.println("inputkan tinggi : (cm)");
     tinggi = input.nextDouble();


     hasil = berat / Math.pow((tinggi/100), 2); 
    Math.ceil(hasil); 



if(hasil < 18.5){
    bmi = "kurang";
}else if(hasil >= 18.5 & hasil <24.9){ 
        bmi = " ideal";
    }else if(hasil >= 24.9 && hasil <29.9){ 
        bmi = "lebih";
    }else{ bmi = "tidak dideteksi";


}
System.out.println(" BMI anda"+Math.ceil(hasil)+" dengan kategori"+bmi);
    }
}