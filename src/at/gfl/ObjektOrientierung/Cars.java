package at.gfl.ObjektOrientierung;

import at.gfl.ObjektOrientierung.Objects.CarObjects;
import at.gfl.ObjektOrientierung.Objects.Tyres;
import at.gfl.ObjektOrientierung.Objects.Engine;

import java.util.Scanner;

public class Cars {
    public static void main(String[] args)
    {
        Tyres t1 = new Tyres("Pirelli",22,24,4,"Winter");
        Tyres t2 = new Tyres("Pirelli",22,24,4,"Winter");
        Tyres t3 = new Tyres("Pirelli",22,24,4,"Winter");
        Tyres t4 = new Tyres("Pirelli",22,24,4,"Winter");


        Scanner scanner = new Scanner(System.in);

        CarObjects c1=new CarObjects(tyreList);

        c1.setBrand("Ferrari");
        c1.setFuelConsumption(17);
        c1.setSerialNumber("F1-75");
        c1.setFuelAmmount(30);
        c1.setMaxFuel(50);
        c1.setRange(100);
        c1.setRestRange(50);



        System.out.println(c1.getBrand());
        System.out.println(c1.getSerialNumber());
        System.out.println(c1.getFuelConsumption());

        c1.CarBreaking();
        System.out.println(c1.getFuelAmmount());
        c1.CarDriving();
        System.out.println(c1.getFuelAmmount());

        c1.TurboBoost();

        System.out.println("How many times do you want to honk?");
        int honker=scanner.nextInt();
        c1.CarHonking(honker);

        c1.getRemainingRange();
        System.out.println(c1.getRestRange()+" km");

        t1.TyreInforamtions();




    }
}
