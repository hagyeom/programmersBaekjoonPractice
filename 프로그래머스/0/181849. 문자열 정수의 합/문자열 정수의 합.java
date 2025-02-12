class Solution {
    public int solution(String num_str) {
        int answer = 0;
        for(char digit:num_str.toCharArray()){
            int num=digit-'0';
            answer+=num;
        }
        return answer;
    }
}