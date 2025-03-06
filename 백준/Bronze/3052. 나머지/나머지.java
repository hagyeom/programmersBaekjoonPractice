import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            int num = scanner.nextInt();
            num %= 42;
            set.add(num);
        }
        System.out.println(set.size());
        
        scanner.close();
    }
}
