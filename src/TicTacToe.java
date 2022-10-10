import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[][] playground = new char[3][3];


        String selectionOfUser = scanner.next();
        String[] selection = selectionOfUser.split(",");
        int rowSelection = Integer.valueOf(selection[0]);
        int colSelection = Integer.valueOf(selection[1]);
        playground[rowSelection][colSelection] = 'x';

        for (int row = 0; row < playground.length; row++) {
            for (int col = 0; col < playground.length; col++) {
                System.out.print("|" + playground[col][row]);

            }
            System.out.println("|");
        }


    }
}
