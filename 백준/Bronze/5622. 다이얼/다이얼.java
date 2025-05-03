import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new java.io.OutputStreamWriter(System.out));

        String s = br.readLine();
        int totalTime = 0;
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'A', 'B', 'C':
                    totalTime += 3;
                    break;
                case 'D', 'E', 'F':
                    totalTime += 4;
                    break;
                case 'G', 'H', 'I':
                    totalTime += 5;
                    break;
                case 'J', 'K', 'L':
                    totalTime += 6;
                    break;
                case 'M', 'N', 'O':
                    totalTime += 7;
                    break;
                case 'P', 'Q', 'R', 'S':
                    totalTime += 8;
                    break;
                case 'T', 'U', 'V':
                    totalTime += 9;
                    break;
                case 'W', 'X', 'Y', 'Z':
                    totalTime += 10;
                    break;
            }
        }
        bw.write(totalTime + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
