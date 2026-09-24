public class LibraryTest {
    public static void main(String[] args) {
       System.out.println("=== Book Info ===");
        Book b1 = new Book(
            "Pemrograman Java Dasar",
            "Informatika Press",
            2024,
            "Fikri Maulana",
            250
        );
        b1.displayBook();

        System.out.println("=== Digital Magazine Info ===");
        DigitalMagazine dm1 = new DigitalMagazine(
            "TechWorld",
            "Digital Media",
            2025,
            12,
            "Oktober",
            45.8,
            "www.techworld.com/download"
        );
        dm1.printDigitalMagazine();
    }
    {System.out.println("====Magazine===");
    Magazine mg1 = new Magazine (
        "Math",
        "Education",
        2025,
        5,
        "January"

    )
}
}