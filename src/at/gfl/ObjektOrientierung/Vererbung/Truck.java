package at.gfl.ObjektOrientierung.Vererbung;


import at.gfl.ObjektOrientierung.Car.Main;
import at.gfl.ObjektOrientierung.Car.Objects.Engine;

public class Truck extends Main {
    private String trailer;


    public Truck(Engine engine, String brand, String color, String trailer){
        super(engine, brand, color);
        this.trailer = trailer;
    }

    public Truck(String v10, String mercdes, String black, String trailer) {
        super(v10, mercdes, black, trailer);
    }

    public String getTrailer() {
        return trailer;
    }

    public void setTrailer(String trailer) {
        this.trailer = trailer;
    }
}
