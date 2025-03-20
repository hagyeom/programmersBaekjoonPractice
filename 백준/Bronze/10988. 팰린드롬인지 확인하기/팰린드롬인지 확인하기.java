import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        StringBuilder sb = new StringBuilder(str);
        String reversedStr = sb.reverse().toString();
        if (str.equals(reversedStr)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
        scanner.close();
    }
}
