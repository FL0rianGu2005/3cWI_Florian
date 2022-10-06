import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int collumn = 3;
        int row = 3;


        char Player1 = 'x';
        char Player2 = 'o';


        System.out.println("P1: Choose Position ");
        int xy = scanner.nextInt();
        for (int i = 0; i < row; i++) {
            for (int e = 0; e < collumn; e++) {
                System.out.print("|" + "");

            }
            System.out.println("|");
        }
    }
}
