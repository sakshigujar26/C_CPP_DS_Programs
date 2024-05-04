//program for while-loop
class whileEx {
    public static void main(String[] args) {
        int i = 3;
        while (i < 10) {
            System.out.println(i);
            i++;
        }
    }
}

//do while loop
 class dowhileEx {
    public static void main(String[] args) {
        int i = 1;
        System.out.println("Condition is not checked for the first time");
        do {
            System.out.println("Now, Condition is true and value is " + i);
            i++;
        } while (i < 10);
    }
}

//for loop
import java.util.Scanner;

class forEx{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer to find multiplication table: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= 10; ++i) {
            System.out.printf("%d * %d = %d\n", n, i, n * i);
        }

        scanner.close();
    }
}




