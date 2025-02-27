import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int prizeMoney = 0;
        int maxNum = 0;

        if (a == b && b == c) {
            prizeMoney = 10000 + a * 1000;
        } else if ((a == b && b != c) || (a == c && a != b)) {
            prizeMoney = 1000 + a * 100;
        } else if (b == c && a != b) {
            prizeMoney = 1000 + b * 100;
        } else {
            maxNum = Math.max(Math.max(a, b), c);
            prizeMoney = maxNum * 100;
        }

        System.out.println(prizeMoney);

        scanner.close();
    }
}
