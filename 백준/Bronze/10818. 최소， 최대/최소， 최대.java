// package 연습.백준10818;

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
		StringTokenizer st;

		int n = Integer.parseInt(br.readLine());
		int nArr[] = new int[n];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			nArr[i] = Integer.parseInt(st.nextToken());
		}
		int min = nArr[0], max = nArr[0];
		for (int i = 0; i < n; i++) {
			if (nArr[i] < min) {
				min = nArr[i];
			} else if (nArr[i] > max) {
				max = nArr[i];
			}
		}
		bw.write(min + " " + max);
		bw.flush();
		br.close();
		bw.close();
	}

}
