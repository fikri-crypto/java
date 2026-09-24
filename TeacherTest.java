public class TeacherTest {
    public static void main(String[] args) {
        // menggunakan constructor dengan parameter
        Teacher t1 = new Teacher("Mathematics", "Budi", 5000000, 35);

        // menggunakan constructor default + setter
        Teacher t2 = new Teacher();
        t2.setName("Siti");
        t2.setSubject("English");
        t2.setSalary(6000000);
        t2.setAge(40);

        // tampilkan data
        t1.print();
        System.out.println();
        t2.print();

        // contoh akses data dengan getter
        System.out.println("\nNama Guru Pertama: " + t1.getName());
    }
}

