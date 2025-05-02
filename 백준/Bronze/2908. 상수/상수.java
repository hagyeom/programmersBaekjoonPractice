import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new java.io.OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        String aStr = st.nextToken();
        String bStr = st.nextToken();

        String reversedAStr = new StringBuilder(aStr).reverse().toString();
        String reversedBStr = new StringBuilder(bStr).reverse().toString();

        int reversedA = Integer.parseInt(reversedAStr);
        int reversedB = Integer.parseInt(reversedBStr);

        bw.write(reversedA > reversedB ? reversedAStr : reversedBStr);

        bw.flush();
        bw.close();
        br.close();
    }
}
