class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        String front_string = my_string.substring(0, s);
        String mid_string = overwrite_string;
        String back_string = my_string.substring(s + overwrite_string.length(), my_string.length());
        answer = front_string + mid_string + back_string;
        return answer;
    }
}