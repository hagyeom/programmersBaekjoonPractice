import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt(); // 영수증에 적힌 총 금액
        int n = scanner.nextInt(); // 영수증에 적힌 구매한 물건의 종류의 수
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt(); // 각 물건의 가격
            int b = scanner.nextInt(); // 각 물건의 개수
            sum += a * b;
        }

        if (sum == x) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        scanner.close();
    }
}
