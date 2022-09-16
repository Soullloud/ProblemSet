public class Circle {
    public static void main(Strings[]args){
        int radius = 10;
        for(int i = -radius; i <= radius; i++) {
            for (int j = -radius; j <= radius; j++) {
                if (i * i + j * j <= radius * radius) {
                    System.out.print("*");
                } else {
                    System.out.print("0");
                }

            }
            System.out.println();
        }
    }
}
