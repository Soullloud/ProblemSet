import java.util.Scanner;

public class Factor {
    public static void main(Strings[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int factor = 2; factor <= i; factor++) {
                if (n % factor == 0) {
                    n /= factor;
                    System.out.println(factor);
                }
            }
        }
    }
}
