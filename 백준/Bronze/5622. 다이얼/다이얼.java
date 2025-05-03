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
                case 'A':
                case 'B':
                case 'C':
                    totalTime += 3;
                    break;
                case 'D':
                case 'E':
                case 'F':
                    totalTime += 4;
                    break;
                case 'G':
                case 'H':
                case 'I':
                    totalTime += 5;
                    break;
                case 'J':
                case 'K':
                case 'L':
                    totalTime += 6;
                    break;
                case 'M':
                case 'N':
                case 'O':
                    totalTime += 7;
                    break;
                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                    totalTime += 8;
                    break;
                case 'T':
                case 'U':
                case 'V':
                    totalTime += 9;
                    break;
                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
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
