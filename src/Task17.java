import java.util.Scanner;

public class Task17 {
    public static void main(Strings[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Ввести кол-во элементов: ");
        int number = scan.nextInt();
        int array[] = new int[number];
        System.out.println("Ввести элементы массива: ");
        for (int i = 0; i < number; i++){
            array[i] = scan.nextInt();
        }
        System.out.println("Переворачиваем массив: ");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }
}
