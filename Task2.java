class Laptop {
    private String Brand;
    private int RAMSize;
    private int BatteryCap;
    private double batteryBackup;

    // Creating Paramterised Constructor
    public Laptop(String brand, int Size, int Batterycap) {
        Brand = brand;
        RAMSize = Size;
        BatteryCap = Batterycap;
    }

    // calculateBatteryBackup() Method
    public double calculateBatteryBackup() {
        batteryBackup = (double) this.BatteryCap / (this.RAMSize * 500);
        return batteryBackup;
    }

    // getters
    public String getBrand() {
        return Brand;
    }

    public int getBatteryCap() {
        return BatteryCap;
    }

    public int getRAMSize() {
        return RAMSize;
    }
}

class Student {
    // Declaration
    private String Name;
    private int StdID;
    private Laptop L1;

    // Parameterised Constructor
    public Student(String name, int ID, String brand, int Size, int Batterycap) {
        Name = name;
        StdID = ID;
        L1 = new Laptop(brand, Size, Batterycap);
    }

    // Printing Student Details
    public void diplayInfo() {
        System.out.println("Student Name: " + this.Name);
        System.out.println("Student ID: " + this.StdID);
        System.out.println("Student Laptop Brand: " + L1.getBrand());
        System.out.println("Student Laptop Battery Capacity: " + L1.getBatteryCap());
        System.out.println("Student Laptop RAM Size: " + L1.getRAMSize());
        System.out.println("Student Laptop Battery Backup: " + L1.calculateBatteryBackup());
    }

}

public class Task2 {
    public static void main(String[] args) {
        Student S1 = new Student("Ayaan", 1000, "HP", 16, 5000);
        Student S2 = new Student("Aliyan", 1001, "DELL", 128, 6000);
        S1.diplayInfo();
        S2.diplayInfo();
    }
}
