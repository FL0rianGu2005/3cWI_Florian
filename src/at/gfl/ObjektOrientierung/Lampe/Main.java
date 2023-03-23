package at.gfl.ObjektOrientierung.Lampe;

import at.gfl.ObjektOrientierung.Lampe.Objects.LightElement;
import at.gfl.ObjektOrientierung.Lampe.Objects.Objects;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        Object o1 = new Objects("LED","Red",3,false);
        Object o2 = new Objects("LED","Blue",3,true);
        Object o3 = new Objects("LED","Yellow",3,false);
        Object o4 = new Objects("LED","Purple",3,true);

        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o3);
        System.out.println(o4);

        LightElement l1 = new LightElement();
        l1.showLightNames();

    }
}
