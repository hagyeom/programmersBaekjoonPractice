import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] arr = new int[5];
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			arr[i] = scanner.nextInt();
			sum += arr[i];
		}
		int avg = sum / 5;
		Arrays.sort(arr);
		int mid = arr[2];

		System.out.println(avg);
		System.out.println(mid);

		scanner.close();
	}

}
