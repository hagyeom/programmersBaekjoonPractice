import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String input = br.readLine();

        int sum = 0;
        char[] inputArr = input.toCharArray();
        for (int i = 0; i < input.length(); i++) {
            sum += inputArr[i] - '0';
        }
        bw.write(sum + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
