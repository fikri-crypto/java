public class Teman {
    // property class 
    String nama;
    String smp; 
    String alamat; 
    String cita2; 
    String hobi;
    char jenisKelamin; 
    int umur;
    // constructor 
    public Teman (String n, String s, String a, String c, String h, char jk, int u)    
    {
        nama = n; 
        smp  = s;
        alamat = a;
        cita2 = c;
        hobi = h;
        jenisKelamin = jk;
        umur = u;
    }
    // method untuk menampilkan data 

    public void cetak () {
        System.out.println(nama);
        System.out.println( smp);
        System.out.println( alamat);
        System.out.println( cita2);
        System.out.println( hobi);
        System.out.println( jenisKelamin);
        System.out.println( umur);

    }
    
}
