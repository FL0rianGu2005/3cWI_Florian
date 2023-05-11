package at.gfl.ObjektOrientierung.Taschenrechner;

import java.awt.*;

public class Wurzelrechner extends Rechner{
    public Wurzelrechner(int height, Color color, int width) {
        super(height, color, width);
    }
    public double square(double a){
        return Math.sqrt(a);
    }
}
