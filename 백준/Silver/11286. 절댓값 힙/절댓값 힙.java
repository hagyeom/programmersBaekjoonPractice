import java.io.*;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 절댓값 힙: 절댓값이 작은 것부터 먼저 나오게
        // 절댓값이 같으면 실제 값이 작은 것부터 나오게
        PriorityQueue<Integer> absHeap = new PriorityQueue<>((a, b) -> {
            if (Math.abs(a) == Math.abs(b)) {
                return a - b; // 절댓값 같으면 작은 수가 우선
            }
            return Math.abs(a) - Math.abs(b); // 절댓값 작은 수가 우선
        });

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken());
            if (x != 0) {
                absHeap.offer(x);
            } else {
                bw.write((absHeap.isEmpty() ? "0" : String.valueOf(absHeap.poll())) + "\n");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
