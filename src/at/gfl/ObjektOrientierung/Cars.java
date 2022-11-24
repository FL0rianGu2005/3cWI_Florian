package at.gfl.ObjektOrientierung;

import at.gfl.ObjektOrientierung.Objects.CarObjects;

import java.util.Scanner;

public class Cars {
    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);

        CarObjects c1=new CarObjects();
        c1.brand="Ferrari";
        c1.FuelConsumption=6;
        c1.serialNumber="F1-75";
        c1.FuelAmmount=30;
        c1.maxFuel=50;
        c1.range=100;
        c1.restRange=50;

        System.out.println(c1.brand);
        System.out.println(c1.FuelConsumption);
        System.out.println(c1.serialNumber);

        c1.CarBreaking();
        System.out.println(c1.FuelAmmount);
        c1.CarDriving();
        System.out.println(c1.FuelAmmount);

        c1.TurboBoost();

        System.out.println("How many times do you want to honk?");
        int honker=scanner.nextInt();
        c1.CarHonking(honker);

        c1.getRemainingRange();
        System.out.println(c1.range+" km");

    }
}
