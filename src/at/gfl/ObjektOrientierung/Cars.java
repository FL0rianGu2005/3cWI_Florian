package at.gfl.ObjektOrientierung;

import at.gfl.ObjektOrientierung.Objects.CarObjects;
import at.gfl.ObjektOrientierung.Objects.Engine;

import java.util.Scanner;

public class Cars {
    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);

        CarObjects c1=new CarObjects(50, 100, 50, 30, "F1-75", "Ferrari", 17);

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
