package study;
import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input n: ");
        int n = scan.nextInt();
        System.out.print("Input m: ");
        int m = scan.nextInt();
        int[][] firstArray = new int[n][m];
        System.out.println("Input element of first array  : ");
        for (int i = 0; i < firstArray.length; i++) {
            for (int j = 0; j < firstArray[i].length; j++) {
                firstArray[i][j] = scan.nextInt();
            }
        }
        int[][] secondArray = new int[n][m];
        System.out.println("Input element of second array  : ");
        for (int i = 0; i < secondArray.length; i++) {
            for (int j = 0; j < secondArray[i].length; j++) {
                secondArray[i][j] = scan.nextInt();
            }
        }
        int[][] thirdArray = new int [n][m];
        for (int i = 0; i < thirdArray.length; i++) {
            for (int j = 0; j < thirdArray[i].length; j++) {
            }
        }
        System.out.println("Matrix one: ");
        for (int i = 0; i < firstArray.length; i++) {
            for (int j = 0; j < firstArray[i].length; j++) {
                System.out.print(firstArray[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Matrix two: ");
        for (int i = 0; i < secondArray.length; i++) {
            for (int j = 0; j < secondArray[i].length; j++) {
                System.out.print(secondArray[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Matrix three: ");
        for (int i = 0; i < thirdArray.length; i++) {
            for (int j = 0; j < thirdArray[i].length; j++) {
                thirdArray[i][j] = firstArray[j][i];
                System.out.print(thirdArray[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Fold Matrix: ");
        int [][] c = new int[n][m];
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                c[i][j] = firstArray[i][j] + secondArray[i][j];
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}