public class TemanTes { 
    public static void main(String[] args) {
        // object dari class Teman
        Teman prabu = new Teman("Prabu", "SMP 1 Turen", "Jl. Merdeka", "Dokter", "Berenang", 'L', 15);
        Teman ponari = new Teman( "Ponari", "SMP 2 Turen", "Jl. Pahlawan", "Guru", "Bersepeda", 'L', 14);
        Teman valdi = new Teman( "Valdi", "MTSn 2 magetan", "Jl. Raya", "Insinyur", "Bermain Game", 'L', 16);
        Teman rio = new Teman( "Rio", "SMP 4 Surabaya", "Jl. Kebangsaan", "Arsitek", "Menggambar", 'L', 15);
        Teman bbg = new Teman( "BBG", "SMP 5 Jayapura", "Jl. Kebun Raya", "Seniman", "Menari", 'L', 17);
        
        // memanggil method cetak untuk menampilkan data
        prabu.cetak();
        ponari.cetak(); 
        valdi.cetak();
        rio.cetak();
        bbg.cetak();
    }
} 
        