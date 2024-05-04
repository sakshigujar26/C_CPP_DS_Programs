//program for string
class stringEx{
    public static void main(String[] args) {
        String greeting = "Hello";
        System.out.println("Greeting message: " + greeting);
    }
}


//C Program to Find the Number of Vowels, Consonants, Digits and White space 

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int v = 0, c = 0, d = 0, s = 0;
        System.out.println("Enter a line of string:");
        String line = scanner.nextLine();

        for (int i = 0; i < line.length(); ++i) {
            char ch = line.charAt(i);
            if (Character.isLetter(ch)) {
                ch = Character.toLowerCase(ch);
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    v++;
                } else {
                    c++;
                }
            } else if (Character.isDigit(ch)) {
                d++;
            } else if (Character.isWhitespace(ch)) {
                s++;
            }
        }

        System.out.println("Vowels: " + v);
        System.out.println("Consonants: " + c);
        System.out.println("Digits: " + d);
        System.out.println("White spaces: " + s);

        scanner.close();
    }
}

