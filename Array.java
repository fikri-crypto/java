public class Array {
    public static void main(String[] args) {
        
         int Gaji []= {2000000, 3000000, 4000000, 5000000};
        int totalGaji = 0;

        String namaKaryawan []= {"Andi", "Budi", "Caca", "Dodi"};
        for (int i = 0; i < Gaji.length; i++) {
            totalGaji += Gaji[i];
        }
        System.out.println(namaKaryawan[2] + " memiliki gaji sebesar " + Gaji[2]);

        int rataRataGaji = totalGaji / Gaji.length;
        System.out.println("Rata-rata gaji karyawan adalah " + rataRataGaji);
        System.out.println("Total gaji seluruh karyawan adalah " + totalGaji);
    }
}
