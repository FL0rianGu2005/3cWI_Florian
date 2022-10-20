package at.gfl.Basics.ttt;

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[][] playground = new char[3][3];
        boolean isPlayer1Active = true;



        do {
            String name = isPlayer1Active ? "Player 1:" : "Player 2";
            System.out.println(name);

            String selectionOfPlayer = scanner.next();

            String[] selection = selectionOfPlayer.split(",");
            int rowSelection = Integer.valueOf(selection[0]);
            int colSelection = Integer.valueOf(selection[1]);

            while (!isFieldEmpty(playground, rowSelection, colSelection)) {
                selectionOfPlayer = scanner.next();
                selection = selectionOfPlayer.split(",");
                rowSelection = Integer.valueOf(selection[0]);
                colSelection = Integer.valueOf(selection[1]);
            }


            if (playground[rowSelection][colSelection] == '\u0000') {
                char charToPrint = '1';
                charToPrint = isPlayer1Active ? 'x' : 'o';
            } else {
                System.out.println("Dieses Feld ist schon belegt!");
            }


            for (int row = 0; row < playground.length; row++) {
                for (int col = 0; col < playground.length; col++) {
                    System.out.print("|" + playground[col][row]);

                }
                System.out.println("|");
            }

        } while (playground[1][1] == playground[1][1]);
    }

    public static boolean isFieldEmpty(char[][] field, int row, int col) {
        if (field[row][col] == '\u0000') {
            return true;
        } else {
            return false;
        }
    }
}
