package study;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input n =  ");
        int n = scanner.nextInt();
        System.out.print("input x = ");
        int x = scanner.nextInt();
        int count = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i * j == x) {
                    count++;
                    //System.out.println(i + " * " + j + " = " + i * j);
                }
            }
        }
        System.out.println(count);
    }
}
