package at.gfl.ObjektOrientierung.Taschenrechner;

import java.awt.*;

public class Rechner {
    private int height;
    private int width;
    private Color color;


    public Rechner(int height, Color color, int width) {
        this.height = height;
        this.color = color;
        this.width = width;
    }

    public double add(double a, double b){
        return a+b;
    }
    public double subtract(double a, double b){
        return a-b;
    }
    public double multiplier(double a, double b){
        return a*b;
    }
    public double divide(double a, double b){
        return a/b;
    }
}