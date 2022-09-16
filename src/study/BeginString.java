package study;

import jdk.nashorn.internal.objects.NativeString;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class BeginString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Палиндромом.");
        System.out.print("Input something text: ");
        String text = scanner.nextLine();
        System.out.println(isPalindrome(text));
        System.out.println("Cортировка слов в строке.");
        System.out.print("Input words: ");
        String words = scanner.nextLine();
        separator(words);
        System.out.println("две строки");
        System.out.print("Input String 1: ");
        String str1 = scanner.nextLine();
        System.out.print("Input String 2: ");
        String str2 = scanner.nextLine();
        System.out.print(contains(str1, str2));
        System.out.println("Заглавная буква");
        System.out.print("Input something words: ");
        String word = scanner.nextLine();
        System.out.println(bigLetter(word));
    }


    static boolean isPalindrome(String text) {
        return text.compareToIgnoreCase(new StringBuilder(text).reverse().toString()) == 0;
    }

    static void separator(String text) {
        String[] string1 = new String[10];
        string1 = text.split(" ");
        Arrays.sort(string1);
        System.out.println(Arrays.toString(string1));
    }

    static boolean contains(String str1, String str2) {
        char[] string;
        char[] subString;
        if(str1.isEmpty() || str2.isEmpty()){
            return false;
        }
        if (str1.length() >= str2.length()) {
            string = str1.toCharArray();
            subString = str2.toCharArray();
        } else {
            string = str2.toCharArray();
            subString = str1.toCharArray();
        }

        for (int i = 0; i < subString.length; i++) {
            boolean result = false;
            for (int j = 0; j < string.length; j++) {
                if(subString[i] == string[j]){
                    result = true;
                    break;
                }
            }
            if(result == false){
                return false;
            }
        }
        return true;
    }

    static int bigLetter(String words) {
        String [] string = words.split(" ");
        for (String word : string) {
            System.out.println(word);
        }
        int count = 0;
        for (int i = 0; i < string.length; i++) {
            int ascii = string[i].charAt(0);
            if(65 <= ascii && ascii <= 90){
                count++;
            }
        }
        return count;
    }
}



