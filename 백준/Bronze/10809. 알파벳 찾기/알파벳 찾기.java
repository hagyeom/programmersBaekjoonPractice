import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int[] arr = new int[26];
        for (int i = 0; i < 26; i++) {
            arr[i] = -1; // -1로 초기화
        }
        for (int i = 0; i < s.length(); i++) {
            if (arr[s.charAt(i) - 'a'] == -1) { // 처음 등장한 문자라면
                arr[s.charAt(i) - 'a'] = i; // 해당 문자의 위치를 저장
            }
        }
        for (int i = 0; i < 26; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
