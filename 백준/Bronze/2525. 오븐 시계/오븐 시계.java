import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt(); // 현재 시각(시)
        int b = scanner.nextInt(); // 현재 시각(분)
        int c = scanner.nextInt(); // 요리하는 데 필요한 시간

        int endH = (a + (b + c) / 60) % 24; // 종료 시각(시)
        int endM = (b + c) % 60; // 종료 시각(분)

        System.out.println(endH + " " + endM);
        scanner.close();
    }
}
