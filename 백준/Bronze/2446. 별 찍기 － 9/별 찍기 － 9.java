import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 2 * n - 1; k > 2 * i; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 2 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 3; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
