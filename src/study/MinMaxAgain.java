package study;

import java.util.Scanner;

public class MinMaxAgain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("size:");
        int size = scan.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < size ; i++) {
            System.out.println("enter " + i + " number");

            array[i] = scan.nextInt();
        }
        int [] reArray = new int [size];
        int counter = 0;
        for (int j = array.length - 1; j >= 0; j--) {
            reArray[counter] = array[j];
            counter++;
        }
        int min = array [0];
        int max = array [0];
        for (int i = 0; i < array.length; i++) {
            int x = array [i];
            if(x < min){
                min = x;
            }
            if(x > max){
                max = x;
            }
        }
        System.out.println(min);
        System.out.println(max);
        System.out.println("");
        for (int y = 0; y < size ; y++) {
            System.out.print(reArray[y]);
        }
    }
}
