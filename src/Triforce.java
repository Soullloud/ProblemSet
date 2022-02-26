public class Triforce {
    public static void main (String[] args) {
        int high = 3;
        for(int i = 1; i <= high; i++) {
            for(int k = high - i; k >= 0; k--) {
                System.out.print(" ");
            }
            for(int a = 1; a < high; a++) {
                System.out.print(" ");
            }
            for(int j = 0; j < 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        System.out.println(" ");

        for(int r = 1; r <= high; r++){
            for(int l = high - r; l > 0; l--){
                System.out.print(" ");
            }
            for(int t = 0; t < 2 * r - 1; t++){
                System.out.print("*");
            }
            System.out.print(" ");
            for(int p = (high - r) * 2; p > 0; p--) {
                System.out.print(" ");
            }
            for(int m = 0; m < 2 * r - 1; m++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
