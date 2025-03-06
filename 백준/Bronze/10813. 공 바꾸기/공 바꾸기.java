import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }

        for (int a = 0; a < m; a++) {
            int i = scanner.nextInt();
            int j = scanner.nextInt();
            int temp = arr[i - 1];
            arr[i - 1] = arr[j - 1];
            arr[j - 1] = temp;
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
