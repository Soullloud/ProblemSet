import java.util.Scanner;

public class Squareroot {
    public static void main(Strings[] args){
        Scanner scan = new Scanner(System.in);
        double x = scan.nextDouble();
        double result;
        double squareRoot = x / 2;
        do {
            result = squareRoot;
            squareRoot = (result + (x / result)) / 2;
        } while ((result - squareRoot) != 0);

        System.out.println(squareRoot);
    }
}
