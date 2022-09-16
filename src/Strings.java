public class Strings {

    public static void main(String[] args) {
        String s1 = new String("aa");
        String s2 = new String("b");
        System.out.println(s1.compareTo(s2));


        boolean x = s1 == s2;
        boolean y = s1.equals(s2);
        int i = s1.compareTo(s2);
        System.out.println(x);
        System.out.println(y);

    }
}
