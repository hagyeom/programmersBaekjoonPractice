import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int endH = (a + (b + c) / 60) % 24;
        int endM = (b + c) % 60;

        System.out.println(endH + " " + endM);

        scanner.close();
    }
}
