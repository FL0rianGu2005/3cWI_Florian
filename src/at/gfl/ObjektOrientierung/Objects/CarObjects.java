package at.gfl.ObjektOrientierung.Objects;

public class CarObjects {
    private int FuelConsumption;
    private String brand;
    private String serialNumber;
    private int FuelAmmount;
    public int maxFuel;
    public int range;
    public int restRange;

    public void CarBreaking(){
        System.out.println("Ich bremse");
    }

    public void CarDriving(){
        this.FuelAmmount=this.FuelAmmount-this.FuelConsumption;
        System.out.println("I´m drivin");
    }
    public void TurboBoost(){
        if (this.FuelAmmount>(maxFuel*0.1)){
            System.out.println("SuperBoostMOOOOOOOOOOOOOOODE");
        }
        else{
            System.out.println("not enough Fuel for SuperBoostMOOOOOOOOOOODE");
        }
    }

    public void CarHonking(int amountOfRepetitions){
        if (amountOfRepetitions<=100){
            for (int i = 0; i < amountOfRepetitions; i++) {
                System.out.println("MEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEP");
            }
        }
        else{
            System.out.println("Übertreib mal nicht");
        }
    }

    public void getRemainingRange(){
        this.range=this.restRange-(this.FuelAmmount-this.FuelConsumption);
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setFuelAmmount(int fuelAmmount) {
        FuelAmmount = fuelAmmount;
    }

    public void setFuelConsumption(int fuelConsumption) {
        FuelConsumption = fuelConsumption;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public int getFuelAmmount() {
        return FuelAmmount;
    }

    public int getFuelConsumption() {
        return FuelConsumption;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public String getBrand() {
        return brand;
    }
}
