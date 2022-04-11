package study;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class InSertSort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Size: ");
        int size = scan.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter " + i + " number: ");
            array[i] = scan.nextInt();
        }
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i;
            while (j > 0 && array[j - 1] > current) {
                array[j] = array[j - 1];
                j--;
            }
            array[j] = current;
            System.out.println(Arrays.toString(array));
        }
        System.out.println("InsertSort : " + Arrays.toString(array));
    }
}
