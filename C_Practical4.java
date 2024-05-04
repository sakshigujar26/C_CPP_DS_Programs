//program for if
class State1 {
    public static void main(String[] args) {
        int m = 40, n = 40;
        if (m == n) {
            System.out.println("m and n are equal");
        }
    }
}


// program for if-else
class State2 {
    public static void main(String[] args) {
        int m = 40, n = 20;
        if (m == n) {
            System.out.println("m and n are equal");
        } else {
            System.out.println("m and n are not equal");
        }
    }
}

// program for nested if
 class State3 {
    public static void main(String[] args) {
        int m = 40, n = 20;
        if (m > n) {
            System.out.println("m is greater than n");
        } else {
            if (m < n) {
                System.out.println("m is less than n");
            } else {
                System.out.println("m is equal to n");
            }
        }
    }
}


//program for checking vowels

import java.util.Scanner;

 class State4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an alphabet: ");
        char c = scanner.next().charAt(0);

        if (c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I' || c == 'o' || c == 'O' || c == 'u' || c == 'U') {
            System.out.println(c + " is a vowel.");
        } else {
            System.out.println(c + " is a consonant.");
        }
    }
}

//if else ladder
class State5 {
    public static void main(String[] args) {
        int i = 25;
        if (i >= 0 && i <= 10) {
            System.out.println("i is between 0 and 10");
        } else if (i >= 11 && i <= 15) {
            System.out.println("i is between 11 and 15");
        } else if (i >= 16 && i <= 20) {
            System.out.println("i is between 16 and 20");
        } else {
            System.out.println("i is greater than 20");
        }
    }
}

