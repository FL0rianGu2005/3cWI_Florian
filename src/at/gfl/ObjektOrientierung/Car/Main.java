package at.gfl.ObjektOrientierung.Car;

import at.gfl.ObjektOrientierung.Car.Objects.CarObjects;
import at.gfl.ObjektOrientierung.Car.Objects.Mirrors;
import at.gfl.ObjektOrientierung.Car.Objects.Tyres;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Tyres t1 = new Tyres("Pirelli",22,24,0,"Slicks");
        Tyres t2 = new Tyres("Pirelli",22,24,0,"Slicks");
        Tyres t3 = new Tyres("Pirelli",22,24,0,"Slicks");
        Tyres t4 = new Tyres("Pirelli",22,24,0,"Slicks");
        Mirrors m1 = new Mirrors(2,10);
        List<Mirrors> mirrors = new ArrayList<>();
        List<Tyres> tyres = new ArrayList<>();
        tyres.add(t1);
        tyres.add(t2);
        tyres.add(t3);
        tyres.add(t4);
        mirrors.add(m1);


        Scanner scanner = new Scanner(System.in);

        CarObjects c1=new CarObjects(17,"Ferrari","SF23",30,50,100,50,tyres,mirrors);

        c1.setBrand("Ferrari");
        c1.setFuelConsumption(17);
        c1.setSerialNumber("SF23");
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
        System.out.println("Tire Informations:");
        t1.TyreInforamtions();
        System.out.println("Mirror Informations:");
        m1.MIrrorInforamtions();




    }
}
