package at.gfl.ObjektOrientierung.Car.Objects;
import at.gfl.ObjektOrientierung.Vererbung.Truck;

import java.util.ArrayList;
import java.util.List;

public class CarObjects {
    private int FuelConsumption;
    private String brand;
    private String serialNumber;
    private int FuelAmmount;
    private int maxFuel;
    private int range;
    private int restRange;
    private String Color;

    private List<Tyres> tyresList;
    private List<Mirrors> mirrorsList;


    public CarObjects(int FuelConsumption, String brand, String serialNumber, int FuelAmmount, int maxFuel, int range, int restRange, List tyresList, List mirrorsList, String Color) {
        this.tyresList = new ArrayList<>();
        this.FuelConsumption = FuelConsumption;
        this.brand = brand;
        this.serialNumber = serialNumber;
        this.FuelAmmount = FuelAmmount;
        this.maxFuel = maxFuel;
        this.range = range;
        this.restRange = restRange;
        this.tyresList = tyresList;
        this.mirrorsList = mirrorsList;
        this.Color = Color;
    }



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

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
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

    public void setMaxFuel(int maxFuel) {
        this.maxFuel = maxFuel;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public void setRestRange(int restRange) {
        this.restRange = restRange;
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

    public int getRestRange() {
        return restRange;
    }


    public List<Tyres> getTyresList() {
        return tyresList;
    }

    public void setTyresList(List<Tyres> tyresList) {
        this.tyresList = tyresList;
    }

    public List<Mirrors> getMirrorsList() {
        return mirrorsList;
    }

    public void setMirrorsList(List<Mirrors> mirrorsList) {
        this.mirrorsList = mirrorsList;
    }
}
