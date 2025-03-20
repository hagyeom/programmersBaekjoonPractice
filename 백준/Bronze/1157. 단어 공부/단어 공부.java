import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int[] count = new int[26]; // 각 알파벳 빈도 수를 저장하는 배열
        int maxCount = 0; // 최댓값 저장
        char maxChar = '?'; // 최빈 문자 저장, 중복 시 '?' 처리
        boolean duplicate = false; // 중복 여부 체크
        for (int i = 0; i < s.length(); i++) {
            char c = Character.toUpperCase(s.charAt(i)); // 문자를 대문자로 변환
            count[c - 'A']++; // 'A'를 기준으로 배열 인덱스를 결정
        }
        for (int i = 0; i < 26; i++) {
            if (count[i] > maxCount) {
                maxCount = count[i]; // 최댓값 갱신
                maxChar = (char) (i + 'A'); // 'A'를 기준으로 문자 변환
                duplicate = false; // 새로운 최댓값이 등장했으므로 중복 아님
            } else if (count[i] == maxCount) {
                duplicate = true;
            }
        }
        System.out.println(duplicate ? "?" : maxChar);
        scanner.close();
    }
}
