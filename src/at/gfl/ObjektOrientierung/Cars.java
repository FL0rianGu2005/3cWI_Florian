package at.gfl.ObjektOrientierung;

import at.gfl.ObjektOrientierung.Objects.CarObjects;

import java.util.Scanner;

public class Cars {
    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);

        CarObjects c1=new CarObjects();
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

    }
}
