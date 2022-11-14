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
                System.out.println("Dieses Feld ist schon belegt!");
                selectionOfPlayer = scanner.next();
                selection = selectionOfPlayer.split(",");
                rowSelection = Integer.valueOf(selection[0]);
                colSelection = Integer.valueOf(selection[1]);
            }


            if (playground[rowSelection][colSelection] == '\u0000') {
                char charToPrint = '1';
                charToPrint = isPlayer1Active ? 'x' : 'o';
                playground[rowSelection][colSelection] = charToPrint;
            }

            for (int row = 0; row < playground.length; row++) {
                for (int col = 0; col < playground.length; col++) {
                    System.out.print("|" + playground[col][row]);

                }
                System.out.println("|");
            }


            isPlayer1Active = !isPlayer1Active;

        } while (!hasWinner(playground));

        System.out.println("Finished");

    }

    public static boolean hasWinner(char[][] field) {

        for (int col = 0; col < 3; col++) {
            if (field[col][0] == field[col][1] && field[col][1] == field[col][2] && field[col][0] != 0) {
                System.out.println("winner");
                return true;

            }
        }

        for (int row = 0; row < 3; row++) {
            if (field[0][row] == field[1][row] && field[1][row] == field[2][row] && field[0][row] != 0) {
                System.out.println("winner");
                return true;
            }
        }

        if (field[0][2] == field[2][0] && field[0][2] == field[1][1] && field[2][0] != '\u0000') {
            System.out.println("winner");
            return true;
        }
        if (field[2][2] == field[1][1] && field[2][2] == field[0][0] && field[2][2] != '\u0000') {
            System.out.println("winner");
            return true;
        }

        return false;
    }


    public static boolean isFieldEmpty(char[][] field, int row, int col) {
        if (field[row][col] == '\u0000') {
            return true;
        } else {
            return false;
        }
    }
}
