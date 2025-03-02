import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];
        int m = scanner.nextInt();
        for (int a = 0; a < m; a++) {
            int i = scanner.nextInt();
            int j = scanner.nextInt();
            int k = scanner.nextInt();
            for (int idx = i - 1; idx < j; idx++) {
                arr[idx] = k;
            }
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
