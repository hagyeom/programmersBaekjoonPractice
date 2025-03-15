// package boj_10808;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			for (int k = 2 * n; k > 2 * i + 2; k--) {
				System.out.print(" ");
			}
			for (int l = 0; l < i + 1; l++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = 0; i < n - 1; i++) {
			for (int j = n - 1; j > i; j--) {
				System.out.print("*");
			}
			for (int k = 0; k < 2 * i + 2; k++) {
				System.out.print(" ");
			}
			for (int l = n - 1; l > i; l--) {
				System.out.print("*");
			}
			System.out.println();
		}

		scanner.close();
	}

}
