import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < 28; i++) {
            set.add(scanner.nextInt());
        }
        for (int i = 1; i <= 30; i++) {
            if (!set.contains(i)) {
                System.out.println(i);
            }
        }

        scanner.close();
    }
}
