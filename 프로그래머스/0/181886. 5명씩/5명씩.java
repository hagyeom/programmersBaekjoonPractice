import java.util.*;

class Solution {
    public String[] solution(String[] names) {
        List<String>result=new ArrayList<>();
        for(int i=0;i<names.length;i+=5){
            // 그룹의 첫 번째 이름 추출
            result.add(names[i]);
        }
        String[]answer=result.toArray(new String[0]);
        
        return answer;
    }
}