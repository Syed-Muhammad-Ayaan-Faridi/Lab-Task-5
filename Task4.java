class Device{
    private int deviceID;
    private double PowerRating;
    private double hoursUsed;
    public Device(int DevID,double Prating,double hours){
        this.deviceID = DevID;
        this.PowerRating = Prating;
        this.hoursUsed = hours;
    }
    public double CalculateEnergy(){
        return PowerRating*hoursUsed;
    }

}
class Room{
    Device D1;
    public Room(int DevID,double Prating,double hours){
        D1 = new Device(DevID,Prating,hours);
    }

    public double deviceUsage(){
        return D1.CalculateEnergy();
    }
}
class House{
    private int HouseID;
    private String OwnerName;
    Room r1;

    public House(int houseid,String ownerName,int DevID,double Prating,double hours){
        HouseID = houseid;
        OwnerName = ownerName;
        r1 = new Room(DevID,Prating,hours);
    }

    public double TotalConsumption(){
        return r1.deviceUsage();
    }

    public int getHouseID() {
        return HouseID;
    }
    public String getOwnerName() {
        return OwnerName;
    }
    public void setHouseID(int houseID) {
        HouseID = houseID;
    }
    public void setOwnerName(String ownerName) {
        OwnerName = ownerName;
    }
}
public class Task4 {
    public static void main(String[] args) {
        House house1 = new House(01, "Umar", 1, 540, 2);
        System.out.println("Total Electricity consumption is: "+house1.TotalConsumption());
    }
}