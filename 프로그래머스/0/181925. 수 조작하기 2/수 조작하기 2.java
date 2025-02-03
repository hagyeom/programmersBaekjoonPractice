class Solution {
    public String solution(int[] numLog) {
        StringBuilder sb=new StringBuilder();
        /*
        1. 명령어 결정하기:
            w: numLog[i]=numLog[i-1]+1
            s: numLog[i]=numLog[i-1]-1
            d: numLog[i]=numLog[i-1]+10
            a: numLog[i]=numLog[i-1]-10
        */
                
        /*
        2. 배열을 순회하며 명령어 찾기
            - 첫 번째 요소부터 시작해서 각 요소와 이전 요소의 차이를 비교합니다.
            - 그 차이에 따라 적절한 명령어를 StringBuilder에 추가합니다.
        */
        for(int i=1;i<numLog.length;i++){
            int diff=numLog[i]-numLog[i-1];
            
            if(diff==1){
                sb.append('w');
            }else if(diff==-1){
                sb.append('s');
            }else if(diff==10){
                sb.append('d');
            }else if(diff==-10){
                sb.append('a');
            }
        }
        
        return sb.toString();
    }
}