import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 문자 배열 준비
        int[] arr = new int[26];

        for (int i = 0; i < 26; i++) {
            arr[i] = -1;
        }

        // 문자열 입력 받기
        String s = br.readLine();

        // 문자 위치 탐색
        for (int i = 0; i < s.length(); i++) {
            int idx = s.charAt(i) - 'a'; // 알파벳의 인덱스를 계산
            if (arr[idx] == -1) { // 해당 알파벳의 초기 값이 -1인 경우,
                arr[idx] = i; // 현재 인덱스를 배열에 저장
            }
        }

        // 결과 출력
        for (int i = 0; i < 26; i++) {
            bw.write(arr[i] + " ");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
