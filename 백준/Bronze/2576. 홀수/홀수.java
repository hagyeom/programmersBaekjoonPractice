import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> input = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();

        for (int i = 0; i < 7; i++) {
            int num = scanner.nextInt();
            input.add(num);
            if (num % 2 != 0) {
                odd.add(num);
            }
        }
        if (odd.isEmpty()) {
            System.out.println(-1);
        } else {
            int sum = 0;
            for (int oddNums : odd) {
                sum += oddNums;
            }
            int min = Collections.min(odd);
            System.out.println(sum);
            System.out.println(min);
        }

        scanner.close();
    }
}
