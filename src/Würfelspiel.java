import java.util.Random;
import java.util.Scanner;

public class Würfelspiel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int selectionOfUser;
        Random random = new Random();
        int randomizer;
        int KIrandomizer;
        int resultPlayer = 0;
        int resultKI=0;
        boolean EndOfGame=false;



        do {
            System.out.println("\t\tWillkommen beim Würfelspiel!\n\n1) Spiel Starten\t\t\t\t2) Spiel Beenden");
            selectionOfUser = scanner.nextInt();
            switch (selectionOfUser) {
                case 1:
                    for (int i = 1; i <= 6; i++) {
                        randomizer = random.nextInt(1, 7);
                        KIrandomizer=random.nextInt(1,7);
                        System.out.println(i+"." + " Wurf: " + randomizer+"\t\t\t\t\t"+i+"."+" KI-Wurf: "+KIrandomizer);
                        resultPlayer += randomizer;
                        resultKI+=KIrandomizer;
                    }
                    System.out.println("Dein Ergebnis: "+resultPlayer+"\t\t\tKI Ergebnis: "+resultKI);

                    if (resultPlayer>resultKI)
                    {
                        System.out.println("Gewonnen!");
                    } else if (resultPlayer==resultKI) {
                        System.out.println("Unentschieden!");
                    } else
                    {
                        System.out.println("Verloren!");
                    }

                    System.out.println("Möchten Sie nochmals Spielen?\n1) Ja\t\t2) Nein");
                    int Return = scanner.nextInt();
                    if (Return == 2) {
                        EndOfGame = true;
                    }
                    break;
                case 2:
                    System.out.println("Beendet");
                    EndOfGame = true;
                    break;
            }

        } while (!EndOfGame);
    }
}
