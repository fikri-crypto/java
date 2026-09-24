public class Fungsi {
    public void ucapSalam(){
        System.out.println("Selamat Pagi");
    }
    public void ucapSelamat(){
        System.out.println("Selamat atas prestasinya");
    }
    public String ucapUjian(){
       String ucap = " selamat Ujian";
        return ucap;    

    }

    static void volumeTabung(int tinggi, int jari){
        double volume = 3.14 * jari * jari * tinggi;
        System.out.println("Volume tabung adalah : " + volume);
    }
    public static void main(String[] args) {
      volumeTabung( 10,  7);  
    }
}
