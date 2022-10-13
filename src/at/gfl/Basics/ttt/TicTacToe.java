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
            playground[rowSelection][colSelection] = 'x';


            for (int row = 0; row < playground.length; row++) {
                for (int col = 0; col < playground.length; col++) {
                    System.out.print("|" + playground[col][row]);

                }
                System.out.println("|");
            }

            System.out.println("Player 2:");

            String selectionOfPlayer2 = scanner.next();
            System.out.println(selectionOfPlayer1);
            System.out.println(selectionOfPlayer2);
            if (selectionOfPlayer2 == selectionOfPlayer1) {
                System.out.println("Dieses Feld wurde schon verwendet!");
            } else
            {
                String[] selection2 = selectionOfPlayer2.split(",");
                int rowSelection2 = Integer.valueOf(selection2[0]);
                int colSelection2 = Integer.valueOf(selection2[1]);
                playground[rowSelection2][colSelection2] = 'o';

                for (int row = 0; row < playground.length; row++) {
                    for (int col = 0; col < playground.length; col++) {
                        System.out.print("|" + playground[col][row]);

                    }
                    System.out.println("|");
                }
            }
        } while (playground[1][1] == playground[1][1]);
    }
}
