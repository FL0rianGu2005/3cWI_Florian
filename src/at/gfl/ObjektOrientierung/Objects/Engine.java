package at.gfl.ObjektOrientierung.Objects;

public class Engine {
    private enum TYPE {GAS, DIESEL}

    private int horsePower;
    private TYPE type;

    private int amount;

    public Engine() {
        this.horsePower = horsePower;
    }

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


}

