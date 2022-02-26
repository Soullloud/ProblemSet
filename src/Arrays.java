import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Arrays1 size :");
        int size = scan.nextInt();
        int[] array1 = new int[size];
        System.out.print("Enter number of Array1 : ");
        for (int i = 0; i < size; i++) {
            array1[i] = scan.nextInt();
        }
        for (int i = 0; i < size; i++) {
            System.out.print(array1[i] + " "); // сам массив
        }
        System.out.println();
        System.out.print("Enter number of Array2 : ");
        int[] array2 = new int[size];
        for (int i = 0; i < size; i++) {
            array2[i] = scan.nextInt();
        }
        for (int i = 0; i < size; i++) {
            System.out.print(array2[i] + " "); // сам массив2
        }
        System.out.println();
        int[] array3 = new int[size];
        int count = 0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    array3[count] = array1[i];
                    System.out.println("Match number is : " + array3[count]);
                    count++;
                }
            }
        }
    }
}



