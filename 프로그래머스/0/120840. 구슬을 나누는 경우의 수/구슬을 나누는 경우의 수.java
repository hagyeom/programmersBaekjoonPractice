import java.math.BigInteger;

class Solution {
    public int solution(int balls, int share) {
        // nCr = n! / (r! * (n - r)!)
        return factorial(balls).divide(factorial(share).multiply(factorial(balls - share))).intValue();
    }

    private BigInteger factorial(int num) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= num; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}
