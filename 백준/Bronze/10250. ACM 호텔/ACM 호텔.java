import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); // 테스트 케이스 개수
        for (int t = 0; t < T; t++) {
            int H = scanner.nextInt(); // 호텔 층 수
            int W = scanner.nextInt(); // 각 층의 방 수
            int N = scanner.nextInt(); // N번째 손님
            int floor = (N % H == 0) ? H : (N % H); // 손님이 배정될 층
            /*
            floor = (N % H == 0) ? H : (N % H);
            N번째 손님이 머물 층을 계산합니다.
            N % H == 0이면 H층에 배정됩니다.
            그렇지 않으면 N % H층에 배정됩니다.
             */
            int roomNumber = (N % H == 0) ? (N / H) : (N / H) + 1; // 방 번호
            /*
            roomNumber = (N % H == 0) ? (N / H) : (N / H) + 1;
            방 번호를 결정합니다.
             */
            System.out.printf("%d%02d\n", floor, roomNumber);
        }
        scanner.close();
    }
}
