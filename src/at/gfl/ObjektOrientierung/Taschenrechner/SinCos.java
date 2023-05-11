package at.gfl.ObjektOrientierung.Taschenrechner;

import java.awt.*;

public class SinCos extends Rechner {

    public SinCos(int height, Color color, int width) {
        super(height, color, width);
    }
    public double sin(double a){
        return Math.sin(a);
    }
    public double cos(double a){
        return Math.cos(a);
    }
}
