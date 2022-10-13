package at.gfl.Basics.cbg;

import java.util.Random;
import java.util.Scanner;

public class Cubegame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int selectionOfUser;
        Random random = new Random();
        int randomizer;
        int KIrandomizer;
        boolean EndOfGame=false;



        do {
            int resultPlayer = 0;
            int resultKI=0;

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
                    System.out.println("\nDein Ergebnis: "+resultPlayer+"\t\t\tKI Ergebnis: "+resultKI);

                    if (resultPlayer>resultKI)
                    {
                        System.out.println("\nGewonnen!");
                    } else if (resultPlayer==resultKI) {
                        System.out.println("\nUnentschieden!");
                    } else
                    {
                        System.out.println("\nVerloren!");
                    }

                    System.out.println("\nMöchten Sie nochmals Spielen?\n1) Ja\t\t2) Nein");
                    int Return = scanner.nextInt();
                    if (Return == 2) {
                        System.out.println("Beendet!");
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
