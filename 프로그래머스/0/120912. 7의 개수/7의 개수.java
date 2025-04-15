class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        for(int num:array){
            // 숫자를 문자열로 변환
            String numStr=String.valueOf(num);
            
            // 문자열 내에서 '7'을 찾아 개수를 더함
            for(char ch:numStr.toCharArray()){
                if(ch=='7'){
                    answer++;
                }
            }
        }
        
        return answer;
    }
}