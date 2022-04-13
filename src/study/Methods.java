package study;

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("x = ");
        int x = scanner.nextInt();
        System.out.print("y = ");
        int y = scanner.nextInt();
        System.out.print("z = ");
        int z = scanner.nextInt();
        checkNum(x, y, z);
    }
    static boolean checkNum(int x, int y, int z) {
        if (x < y) {
            return (z > x && z < y);
        } else if (x > y) {
            return (z < x && z > y);
        } else {
            return x == z;
        }
    }
}
