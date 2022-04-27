package study;

import java.util.Arrays;
import java.util.Scanner;

public class BeginString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input something text: ");
        String text = scanner.nextLine();
        System.out.println(isPalindrome(text));
        System.out.print("Input words: ");
        String words = scanner.nextLine();
        separator(words);
        System.out.print("Input first string: ");
        String oneString = scanner.nextLine();
        System.out.print("Input second string: ");
        String twoString = scanner.nextLine();
        twoStings(oneString, twoString);
    }

    static boolean isPalindrome(String text) {
        String s1 = text.toUpperCase().replaceAll("[^A-Za-z]", " ");
        StringBuffer s2 = new StringBuffer(s1).reverse();
        boolean isAnswer = true;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                isAnswer = false;
                break;
            }
        }
        return isAnswer;
    }

    static void separator(String text) {
        String[] word = text.split(" ");
        for (String words : word) {
            System.out.println(words);
        }
    }

    static void twoStings(String oneString, String twoString) {
        boolean x = oneString.equals(twoString);
        System.out.println(x);
    }
}