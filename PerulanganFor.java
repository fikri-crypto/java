public class PerulanganFor {
    public static void main(String[] args) {
        for (int hitungan = 0; hitungan <= 50; hitungan+=4) {
            System.out.print(hitungan+ ",");
        }

        Scanner input = new Scanner (System.in);
        System.out.println("Masukkan Nilai Awal");
        int awal = input.nextInt();
        System.out.println("Masukkan Nilai Akhir");
        int akhir = input.nextInt();
        int temp = 0;

        for (int i =awal; i < akhir; i+=2) {
            System.out.print(i+",");
            temp+=i;
        }
        System.out.println();
        System.out.println("Total Deret tersebut adalah"+temp);
    }
}
