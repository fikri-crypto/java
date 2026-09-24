public class Prisonerr {
    public String name;
    public double height;
    public int yearsServed;

    public Prisonerr(String name, double height, int yearsServed) {
        this.name = name;
        this.height = height;
        this.yearsServed = yearsServed;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Height: " + height + " meters");
        System.out.println("Years Served: " + yearsServed);
    }

    @Override
    public String toString() {
        return "Prisoner{name='" + name + "', height=" + height + ", yearsServed=" + yearsServed + "}";
    }
    
}
