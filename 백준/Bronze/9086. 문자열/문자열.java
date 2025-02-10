import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            String str = sc.next();
            System.out.println(str.toCharArray()[0] + "" + str.toCharArray()[str.length() - 1]);
        }

        sc.close();
    }
}
