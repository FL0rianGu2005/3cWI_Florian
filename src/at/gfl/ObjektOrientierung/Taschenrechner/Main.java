package at.gfl.ObjektOrientierung.Taschenrechner;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Rechner r1 = new Rechner(10, new Color(0, 0, 0), 7);
        SinCos sc1 = new SinCos(10,new Color(0,0,0),7);
        Wurzelrechner w1 = new Wurzelrechner(10,new Color(0,0,0),7);
        double ResultAdd = r1.add(11, 8);
        double ResultSub = r1.subtract(20, 7);
        double ResultMult = r1.multiplier(7,6);
        double ReultDivide = r1.divide(9,4);


        System.out.println("Addition: "+ResultAdd);
        System.out.println("Subtraction: "+ResultSub);
        System.out.println("Multiply: "+ResultMult);
        System.out.println("Divide: "+ReultDivide);
        System.out.println("Sinus: "+sc1.sin(2));
        System.out.println("Cosinus: "+sc1.cos(90));
        System.out.println("Square: "+w1.square(9));
    }
}