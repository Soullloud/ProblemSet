package study;

import java.util.Scanner;

public class TikTakToe {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[][] playField = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(playField[i][j] + " ");
            }
            System.out.println();
        }
    }
}
