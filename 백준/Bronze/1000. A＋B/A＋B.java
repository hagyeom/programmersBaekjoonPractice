import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 사용자로부터 한 줄 입력받기
        String line = br.readLine();
        // 입력받은 문자열을 공백으로 분리하여 정수 배열로 변환
        String[] parts = line.split(" ");
        int a = Integer.parseInt(parts[0]);
        int b = Integer.parseInt(parts[1]);

        // 두 정수의 합 계산
        int sum = a + b;

        // 결과 출력
        bw.write(sum + "\n");
        bw.flush();
    }
}
