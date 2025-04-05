import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int mul = a * b * c;
        int[] count = new int[10];
        String mulStr = String.valueOf(mul);
        for (int i = 0; i < mulStr.length(); i++) {
            count[mulStr.charAt(i) - '0']++;
        }
        for (int num : count) {
            System.out.println(num);
        }
        scanner.close();
    }
}
