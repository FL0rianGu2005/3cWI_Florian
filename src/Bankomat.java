import java.util.Scanner;

public class Bankomat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int iKontostand = 0;
        int iEinzahlen = 0;
        int iAbheben = 0;
        boolean stop = false;


        System.out.println("Guten Tag!");
        do {

            System.out.println("Was möchten Sie tun? \n1) Einzahlen \n2) Abheben \n3) Kontostand ansehen \n4)Beenden\n");
            int selectionOfUser = scanner.nextInt();


            switch (selectionOfUser) {
                case 1: {
                    System.out.println("Wie viel Geld möchten Sie Einzahlen?");
                    int putInMoney = scanner.nextInt();
                    System.out.println(putInMoney +"€ wurden Eingezahlt!");
                    iKontostand = iKontostand+putInMoney;
                    break;
                }
                case 2: {
                    System.out.println("Wie viel Geld möchten Sie Abheben?");
                    int withdrawMoney = scanner.nextInt();
                    System.out.println(withdrawMoney+"€ wurden Abgehoben!");
                    iKontostand = iKontostand-withdrawMoney;

                    break;
                }
                case 3 :{
                    System.out.println("Ihr Kontostand beträgt: " + iKontostand+"€");
                break;
                }
                case 4: {
                    System.out.println("Auf Wiedersehen!");
                    stop = true;
                    break;
                }

            }
        }while (stop == false);
    }
}