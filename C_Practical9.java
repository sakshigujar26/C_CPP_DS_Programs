import java.util.Scanner;

class funEx {
    // method declaration
    public static float square(float x) {
        float p;
        p = x * x;
        return p;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float m, n;
        System.out.println("Enter some number for finding square");
        m = scanner.nextFloat();

        // method call
        n = square(m);
        System.out.println("Square of the given number " + m + " is " + n);

        scanner.close();
    }
}

