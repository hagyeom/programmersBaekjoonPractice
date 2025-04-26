import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Queue<Integer> queue = new LinkedList<>();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            String cmd = st.nextToken();

            switch (cmd) {
                case "push":
                    int x = Integer.parseInt(st.nextToken());
                    queue.add(x);
                    break;
                case "pop":
                    bw.write((queue.isEmpty() ? "-1" : String.valueOf(queue.poll())) + "\n");
                    break;
                case "size":
                    bw.write(String.valueOf(queue.size()) + "\n");
                    break;
                case "empty":
                    bw.write((queue.isEmpty() ? "1" : "0") + "\n");
                    break;
                case "front":
                    bw.write((queue.isEmpty() ? "-1" : String.valueOf(queue.peek())) + "\n");
                    break;
                case "back":
                    bw.write((queue.isEmpty() ? "-1" : String.valueOf(((LinkedList<Integer>) queue).getLast())) + "\n");
                    break;
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
