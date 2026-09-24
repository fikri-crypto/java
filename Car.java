package RPL6;

public class Car extends Vehicle{
    int numDoors;
    Boolean isElectric; 

    public Car () {
      super();//memanggil konstraktor dari kelas Vehicle    
        numDoors = 6; 
        isElectric = true;
    }
    public Car (int numDoors, Boolean isElectric, String merk ,double LiterPerKilo) {
      super(merk, LiterPerGalon );//memanggil konstraktor dari kelas Vehicle
        this.numDors = numDoors; 
        this.isElectric = isElectric;
    }
    public int getNumDoors() {
        return numDoors;
    }
    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }
    public Boolean getIsElectric() {
        return isElectric;
    }
    public void setIsElectric(Boolean isElectric) {
        this.isElectric = isElectric;
    }
    public void print() {
        super.print(); //memanggil method print dari kelas Vehicle
        System.out.println("Number of Doors: "+numDoors);
        System.out.println("Is Electric: "+isElectric);
    }

    
}
    
    