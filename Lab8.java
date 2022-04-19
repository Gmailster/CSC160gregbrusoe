package previousAssignments;// Greg Brusoe
// CSC 160 Computer Science I
// April 4, 2022
// Lab 8 -magic square- on replit
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Lab8 {
    public static void main(String[] args) throws IOException {
        File open = new File("C:\\Users\\gregb\\IdeaProjects\\warrior.Stocks.Main\\src\\Lab8Data.txt");
        Scanner scanner = new Scanner(open);
        int[][] square = new int[4][4];
        boolean isMagicSquare = false;
        boolean close = false;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                square[i][j] = scanner.nextInt();
            }
        }
        while (close == false) {
            isMagicSquare = false;
            int root = square[0][0] + square[1][1] + square[2][2] + square[3][3];
            if (root == (square[3][0] + square[2][1] + square[1][2] + square[0][3])) { // diagonal check
                for (int i = 0; i < 4; i++) {
                    if (root == (square[i][0] + square[i][1] + square[i][2] + square[i][3])) { // row check
                        if (root == (square[0][i] + square[1][i] + square[2][i] + square[3][i])) { // column check
                            isMagicSquare = true;
                        }
                    }
                }
            }

            // print array in 4x4 area
            for (int i=0;i<4;i++) {
                for (int j=0;j<4;j++) {
                    System.out.print(square[i][j]+" ");
                }
                System.out.println("");
            }

            if (isMagicSquare == true) {
                System.out.println("IS a magic square");
            } else {
                System.out.println("NOT a magic square");
            }
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    square[i][j] = scanner.nextInt();
                    if (square[i][j]==-999) {
                        close = true;
                        break;
                    }
                }
            }
        }
    }
}
