import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Vector<Integer> v = new Vector<Integer>(7);
		Vector<Integer> odd = new Vector<Integer>();

		for (int i = 0; i < 7; i++) {
			v.add(scanner.nextInt());
		}

		for (int i = 0; i < 7; i++) {
			if (v.get(i) % 2 != 0) {
				odd.add(v.get(i));
			}
		}

		if (odd.isEmpty()) {
			System.out.println("-1");
		} else {
			int sum = 0;
			for (int i = 0; i < odd.size(); i++) {
				Collections.sort(odd);
				int n = odd.elementAt(i);
				sum += n;
			}
			int min = Math.min(odd.firstElement(), odd.lastElement());
			System.out.println(sum);
			System.out.println(min);
		}

		scanner.close();
	}

}
