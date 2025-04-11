import java.util.Arrays;

class Solution {
    public int solution(int[] array, int n) {
        // 정렬하여 작은 값을 우선적으로 비교할 수 있도록 함
        Arrays.sort(array);
        
        // 초기값 설정
        int closest=array[0];
        int minDifference=Math.abs(closest-n);
        
        // 배열의 모든 요소를 확인
        for(int num:array){
            int difference=Math.abs(num-n);
            
            // 더 작은 차이가 있으면 업데이트
            if(difference<minDifference){
                closest=num;
                minDifference=difference;
            }else if(difference==minDifference&&num<closest){
                // 거리가 같다면 더 작은 수를 선택
                closest=num;
            }
        }
        return closest;
    }
}