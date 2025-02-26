import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long a = scanner.nextLong();
        long b = scanner.nextLong();

        if (a > b) {
            long temp = a;
            a = b;
            b = temp;
        }
        if (a == b || b - a - 1 == 0) {
            System.out.println(0);
        } else {
            System.out.println(b - a - 1);
            for (long i = a + 1; i < b; i++) {
                System.out.print(i + " ");
            }
        }
        
        scanner.close();
    }
}
