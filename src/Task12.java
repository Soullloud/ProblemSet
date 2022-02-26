import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = 0;
        int w = 0;
        while (n > 0) {
            int t = 0;
            t = n % 10;
            if (t % 2 != 0) {
                m = m * 10 + t;
            }
            n = n / 10;
        }
        while (m > 0) {
            int t = 0;
            t = m % 10;
            w = w * 10 + t;
            m = m / 10;
        }
        System.out.print(w);
    }
}
