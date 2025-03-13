import java.util.*;

class Solution {
    public int solution(String before, String after) {
        // 두 문자열을 문자 배열로 변환하고 정렬
        char[]beforeArr=before.toCharArray();
        char[]afterArr=after.toCharArray();
        Arrays.sort(beforeArr);
        Arrays.sort(afterArr);
        
        // 정렬된 결과가 같으면 1, 다르면 0
        if(Arrays.equals(beforeArr,afterArr)){
            return 1;
        }else{
            return 0;
        }
    }
}