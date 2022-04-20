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
        System.out.println(checkNum(x, y, z));

        System.out.print("Num = ");
        int num = scanner.nextInt();
        System.out.print(bitDepth(num));

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
    static int bitDepth(int num){
        int count = 1;
        while (num >= 10) {
            count++;
            num = num / 10;
        }
        return count;
    }
}
