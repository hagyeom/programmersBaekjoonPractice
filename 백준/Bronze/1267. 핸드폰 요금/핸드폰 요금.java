import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] callTimes = new int[N];
        for (int i = 0; i < N; ++i) {
            callTimes[i] = scanner.nextInt();
        }

        int yCost = 0, mCost = 0;
        for (int i = 0; i < N; ++i) {
            yCost += (callTimes[i] / 30 + 1) * 10;
            mCost += (callTimes[i] / 60 + 1) * 15;
        }

        if (yCost < mCost) {
            System.out.println("Y " + yCost);
        } else if (yCost > mCost) {
            System.out.println("M " + mCost);
        } else {
            System.out.println("Y M " + yCost);
        }
    }
}
