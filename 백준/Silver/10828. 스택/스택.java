import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String cmd = st.nextToken();

            switch (cmd) {
                case "push":
                    int X = Integer.parseInt(st.nextToken());
                    stack.push(X);
                    break;
                case "pop":
                    bw.write((stack.isEmpty() ? "-1" : String.valueOf(stack.pop())) + "\n");
                    break;
                case "size":
                    bw.write((String.valueOf(stack.size())) + "\n");
                    break;
                case "empty":
                    bw.write((stack.isEmpty() ? "1" : "0") + "\n");
                    break;
                case "top":
                    bw.write((stack.isEmpty() ? "-1" : String.valueOf(stack.peek())) + "\n");
                    break;
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
