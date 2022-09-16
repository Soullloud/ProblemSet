import java.util.Scanner;

public class Max {
    public static void main(Strings[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size ; i++) {
            array[i] = scan.nextInt();
        }
        for (int i = 0; i < size; i++) {
            //System.out.print(array[i]);
        }
        for (int i = 1; i < size - 1; i++){
            if (array[i] / 2 == 0){
                System.out.println(array[i]);
            }
            if((array[i] > array[i - 1]) && (array[i] > array[i + 1])) {
                    System.out.println(array[i]);
            }
        }
        System.out.println();
    }
}
