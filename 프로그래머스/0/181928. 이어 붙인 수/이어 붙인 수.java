class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        // 1. 리스트를 순회하며 홀수와 짝수를 분리하기
        // num_list를 순회하면서 각각의 홀수와 짝수를 분리해 문자열로 저장.
        // odd: 홀수, even: 짝수
        String odd=""; 
        String even="";
        for(int i=0;i<num_list.length;i++){
            if(num_list[i]%2==1){ // num_list의 요소값이 홀수인 경우
                odd+=Integer.toString(num_list[i]);
            }else if(num_list[i]%2==0){ // num_list의 요소값이 짝수인 경우
                even+=Integer.toString(num_list[i]);
            }
        }
        // 2. 문자열을 숫자로 변환하기
        int oddNum=Integer.parseInt(odd);
        int evenNum=Integer.parseInt(even);
        // 3. 결과값 반환하기
        answer=oddNum+evenNum;
        return answer;
    }
}