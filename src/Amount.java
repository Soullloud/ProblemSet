import java.util.Scanner;

public class Amount{
    public static void main(Strings[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Input n: ");
        int n = scan.nextInt();
        int t = 1;
        int result = 0;
        for(int i = 1; i <= n; i++) {
            System.out.print(t);
            if(i < n) {
                System.out.println(" + ");
            }
            result = result + t;
            t = (t * 10) + 1;
        }
        System.out.println("Result is : " + result);
    }
}
