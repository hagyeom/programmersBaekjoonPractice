class Solution {
    public int solution(int num, int k) {
        String numStr=String.valueOf(num);
        int answer=numStr.indexOf(String.valueOf(k));
        if(answer<0){
            return answer;
        }else{
            return answer+1;
        }
    }
}