import java.util.Scanner;

public class Numbers {
    public static void main(Strings[] args) {
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        int m = scan.nextInt();
        for(int i = k; i < m; i++) {
            if(i % 3 == 0) {
            System.out.println(i);
            }

        }
    }
}
