public class PrisonTest {
    public static void main(String[] args) {
        Prisonerr prisoner1 = new Prisonerr("John Doe", 1.75, 5);
        Prisonerr prisoner2 = new Prisonerr("Jane Smith", 1.65, 3);

        prisoner1.display();
        System.out.println(prisoner1.toString());

        prisoner2.display();
        System.out.println(prisoner2.toString());
    }
}

