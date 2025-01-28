import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		ArrayList<Integer> heights = new ArrayList<Integer>();
		int sum = 0;

		// 아홉 난쟁이의 키를 입력받는다.
		for (int i = 0; i < 9; i++) {
			int height = scanner.nextInt();
			heights.add(height);
			sum += height;
		}

		// 9개의 키 중 2개를 제외하고 7개의 합이 100이 되는 경우를 찾는다.
		boolean found = false;
		int first = -1, second = -1;
		for (int i = 0; i < 9; i++) {
			for (int j = i + 1; j < 9; j++) {
				if (sum - heights.get(i) - heights.get(j) == 100) {
					first = i;
					second = j;
					found = true;
					break;
				}
			}
			if (found) {
				break;
			}
		}

		// 남은 7명의 키만 모아서 오름차순 정렬 후 출력
		ArrayList<Integer> result = new ArrayList<Integer>();
		for (int i = 0; i < 9; i++) {
			if (i != first && i != second) {
				result.add(heights.get(i));
			}
		}
		Collections.sort(result);
		for (int height : result) {
			System.out.println(height);
		}

		scanner.close();
	}

}
