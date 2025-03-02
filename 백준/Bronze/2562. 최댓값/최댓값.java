import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>(9);

        for (int i = 0; i < 9; i++) {
            int num = scanner.nextInt();
            numbers.add(num);
        }

        int max = Collections.max(numbers);

        int maxIndex = numbers.indexOf(max) + 1;

        System.out.println(max);
        System.out.println(maxIndex);

        scanner.close();
    }
}