class Solution {
    // 최대공약수 구하는 메서드
    int gcd(int a, int b) {
        int r;
        while (b > 0) {
            r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
    public int solution(int n) {
        int answer = 0;
        int lcm = n * 6 / gcd(n, 6);
        answer = lcm / 6;
        return answer;
    }
}