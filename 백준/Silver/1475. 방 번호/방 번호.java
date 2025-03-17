import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String n = scanner.next();
		int[] count = new int[10];
		for (char c : n.toCharArray()) {
			count[c - '0']++;
		}
		count[6] = (int) Math.ceil((count[6] + count[9]) / 2.0);
		count[9] = 0;
		int countMax = 0;
		for (int i : count) {
			countMax = Math.max(i, countMax);
		}
		System.out.println(countMax);
		scanner.close();
	}

}
