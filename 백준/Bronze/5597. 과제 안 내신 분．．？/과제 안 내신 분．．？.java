import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashSet<Integer> a = new HashSet<>(30);
        HashSet<Integer> b = new HashSet<>(28);
        for (int i = 1; i <= 30; i++) {
            a.add(i);
        }

        for (int i = 0; i < 28; i++) {
            int n = scanner.nextInt();
            b.add(n);
        }

        a.removeAll(b);

        List<Integer> answer = new ArrayList<>(a);
        Collections.sort(answer);
        for (int num : answer) {
            System.out.println(num);
        }

        scanner.close();
    }
}
