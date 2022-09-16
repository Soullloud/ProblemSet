import java.util.Scanner;

public class Math {
    public static void main(Strings[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        double s = 0;
        for (int m = 1; m <= n; m++) {
            double k = 1;
            for (int i = 1; i <= m - 1; i++) { //факториал от 1 до m
                k = i * k;
            }
            k = k * k;

            double y = 1;
            for (int i = 1; i <= 2 * m; i++) {
                y = i * y;
            }
            double r = k / y;

            s = r + s;
        }
        System.out.println(s);

    }
}

