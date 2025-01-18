import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int n) {
       List<Integer> primeFactors = new ArrayList<>();
        int divisor = 2;

        // 소인수분해 과정
        while (n > 1) {
            if (n % divisor == 0) {
                if (!primeFactors.contains(divisor)) {
                    primeFactors.add(divisor); // 중복되지 않도록 추가
                }
                n /= divisor; // 나눈 결과로 갱신
            } else {
                divisor++; // 나눌 수 없으면 다음 숫자로 이동
            }
        }

        // 결과를 배열로 변환
        int[] result = new int[primeFactors.size()];
        for (int i = 0; i < primeFactors.size(); i++) {
            result[i] = primeFactors.get(i);
        }

        return result;
    }
}