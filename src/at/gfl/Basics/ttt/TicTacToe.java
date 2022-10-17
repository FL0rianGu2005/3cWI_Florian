package at.gfl.Basics.ttt;

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[][] playground = new char[3][3];

        do {


            System.out.println("Player 1:");

            String selectionOfPlayer1 = scanner.next();
            String[] selection = selectionOfPlayer1.split(",");
            int rowSelection = Integer.valueOf(selection[0]);
            int colSelection = Integer.valueOf(selection[1]);
            if (playground[rowSelection][colSelection] == '\u0000') {
                playground[rowSelection][colSelection] = 'x';
            } else {
                System.out.println("Das Feld ist schon belegt!");
            }


            for (int row = 0; row < playground.length; row++) {
                for (int col = 0; col < playground.length; col++) {
                    System.out.print("|" + playground[col][row]);

                }
                System.out.println("|");
            }

            System.out.println("Player 2:");

            String selectionOfPlayer2 = scanner.next();

            String[] selection2 = selectionOfPlayer2.split(",");
            int rowSelection2 = Integer.valueOf(selection2[0]);
            int colSelection2 = Integer.valueOf(selection2[1]);

            if (playground[rowSelection][colSelection] == '\u0000') {
                playground[rowSelection][colSelection] = 'o';
            } else {
                System.out.println("Dieses Fels ist schon belegt!");
            }

            for (int row = 0; row < playground.length; row++) {
                for (int col = 0; col < playground.length; col++) {
                    System.out.print("|" + playground[col][row]);

                }
                System.out.println("|");
            }

        } while (playground[1][1] == playground[1][1]);
    }
}
