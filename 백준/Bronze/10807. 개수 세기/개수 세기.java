// package 연습.백준10807;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());

		int[] nArr = new int[n];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			nArr[i] = Integer.parseInt(st.nextToken());
		}

		int v = Integer.parseInt(br.readLine());
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (nArr[i] == v) {
				count++;
			}
		}

		bw.write(Integer.toString(count));
		bw.newLine();

		br.close();
		bw.close();
	}
}
