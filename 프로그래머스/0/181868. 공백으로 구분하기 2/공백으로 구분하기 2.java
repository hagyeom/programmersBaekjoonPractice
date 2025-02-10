// split(String regex), "\s+" : 하나 이상의 공백을 의미
class Solution {
    public String[] solution(String my_string) {
        String[] answer = {};
        answer=my_string.trim().split("\\s+");
        return answer;
    }
}