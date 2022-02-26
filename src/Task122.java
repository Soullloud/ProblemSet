import java.util.Scanner;

public class Task122 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int originalnumber = scan.nextInt();
        int result = 0;
        int delitel = 1;
        int saveoriginalnumber = originalnumber;
        while (originalnumber > 0) {
            originalnumber = originalnumber / 10;
            delitel *= 10;
        }
        delitel = delitel / 10;

        while (saveoriginalnumber > 0) {
            int y = saveoriginalnumber / delitel;
            if (y % 2 != 0) {
                result = result * 10 + y;
            }
            saveoriginalnumber = saveoriginalnumber % delitel;
            delitel /= 10;
        }
        System.out.println(result);
    }
}
