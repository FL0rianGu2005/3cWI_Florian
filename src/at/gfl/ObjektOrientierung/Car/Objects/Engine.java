package at.gfl.ObjektOrientierung.Car.Objects;

public class Engine {
    private enum TYPE {GAS, DIESEL}

    private int horsePower;
    private TYPE type;
<<<<<<< HEAD:src/at/gfl/ObjektOrientierung/Objects/Engine.java

    private int amount;

    public Engine() {
        this.horsePower = horsePower;
    }
=======
>>>>>>> origin/main:src/at/gfl/ObjektOrientierung/Car/Objects/Engine.java

    public Engine(int horsePower, TYPE type) {
        this.horsePower = horsePower;
        this.type = type;
    }

    public int drive(){return amount;}

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public TYPE getType() {
        return type;
    }

<<<<<<< HEAD:src/at/gfl/ObjektOrientierung/Objects/Engine.java

=======
>>>>>>> origin/main:src/at/gfl/ObjektOrientierung/Car/Objects/Engine.java
}

