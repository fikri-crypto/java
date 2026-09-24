package RPL6;

public class Vehicle {
   //properti
    String merk; 
    int LiterPerKilo;
    // konstraktor 
    public Vehicle () {
          merk =  " Toyota"; 
         LiterPerKilo = 20;
}
    public Vehicle (String merk, int LiterPerKilo) {
        this.merk = merk; 
        this.LiterPerKilo = LiterPerKilo;

    } 
    public String getMerk() {
        return merk;
    }
    public int getLiterPerKilo() {
        return LiterPerKilo;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }
    public void setLiterPerKilo(int literPerKilo) {
        LiterPerKilo = literPerKilo;
    }
    
    public void print() {
        System.out.println("Merk: "+merk);
        System.out.println("Liter Per Kilo: "+LiterPerKilo);
    }
} 
