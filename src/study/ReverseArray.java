package study;

import javafx.scene.paint.Stop;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Size: ");
        int size = scan.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter " + i + " number: ");
            array[i] = scan.nextInt();
        }
        for (int i = 0; i < array.length / 2; i++) {
            int reverce = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = reverce;
        }
        for (int i = 0; i < size; i++) {
            if (array[i] == 0) {
                int zero = array[i];
                array[i] = array[array.length - 1 - i];
                array[array.length - 1 - i] = zero;
            }
        }
        System.out.println("Changed array : " + Arrays.toString(array));
    }
}
