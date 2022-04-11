import java.util.Scanner;

public class Task15 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Input n : ");
        int n = scan.nextInt();
       // System.out.print("Input m : ");
        //int m = scan.nextInt();
        for(int i = 0; i < 3; i++){
            if(n < 3){
                System.out.print(n);
            } else {
                System.out.print("False");
            }
        }

        for (int i = 0; i < 5; i++){
            if(n < 5){
                System.out.print(n);
            } else {
                System.out.print("False");
            }
        }
    }
}
