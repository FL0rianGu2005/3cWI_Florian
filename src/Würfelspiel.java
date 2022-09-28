import java.util.Scanner;

public class Würfelspiel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean EndOfGame = false;
        do {
            System.out.println("\t\tWillkommen beim Würfelspiel!\n\n1) Spiel Starten\t\t\t\t2) Spiel Beenden");
            int selectionOfUser = scanner.nextInt();

            switch (selectionOfUser) {
                case 1:
                    for (int i=1;i<=6;i++) {
                        System.out.println(i+"Wurf: ");
                    }
                    System.out.println("Möchten Sie nochmals Spielen?\n1) Ja\t\t2) Nein");
                    int Return = scanner.nextInt();
                    if (Return==2)
                    {
                        EndOfGame=true;
                    }
                    break;
                case 2:
                    System.out.println("Beendet");
                    EndOfGame = true;
                    break;
            }

        } while (EndOfGame == false);
    }
}
