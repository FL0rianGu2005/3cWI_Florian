package at.gfl.ObjektOrientierung.Objects;

public class CarObjects {
    public int FuelConsumption;
    public String brand;
    public String serialNumber;
    public int FuelAmmount;
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
}
