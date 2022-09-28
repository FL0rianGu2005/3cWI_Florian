import java.util.Random;
import java.util.Scanner;

public class Würfelspiel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int selectionOfUser = scanner.nextInt();
        Random random = new Random();
        int randomizer;
        int resultPlayer = 0;
        int resultKI=0;
        boolean EndOfGame = false;

        do {
            System.out.println("\t\tWillkommen beim Würfelspiel!\n\n1) Spiel Starten\t\t\t\t2) Spiel Beenden");

            switch (selectionOfUser) {
                case 1:
                    for (int i = 1; i <= 6; i++) {
                        randomizer = random.nextInt(1, 7);
                        System.out.println(i + " Wurf: " + randomizer);
                        resultPlayer += randomizer;
                    }
                    System.out.println(resultPlayer);


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
