import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next(); // 입력받은 문자열
        int sum = 0; // 문자열을 다이얼로 변환한 값

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i); // 문자열을 문자로 변환
            if (c == 'A' || c == 'B' || c == 'C') {
                sum += 3; // A,B,C는 3초
            } else if (c == 'D' || c == 'E' || c == 'F') {
                sum += 4; // D,E,F는 4초
            } else if (c == 'G' || c == 'H' || c == 'I') {
                sum += 5; // G,H,I는 5초
            } else if (c == 'J' || c == 'K' || c == 'L') {
                sum += 6; // J,K,L는 6초
            } else if (c == 'M' || c == 'N' || c == 'O') {
                sum += 7; // M,N,O는 7초
            } else if (c == 'P' || c == 'Q' || c == 'R' || c == 'S') {
                sum += 8; // P,Q,R,S는 8초
            } else if (c == 'T' || c == 'U' || c == 'V') {
                sum += 9; // T,U,V는 9초
            } else if (c == 'W' || c == 'X' || c == 'Y' || c == 'Z') {
                sum += 10; // W,X,Y,Z는 10초
            }
        }
        System.out.println(sum);
        sc.close();
    }
}
