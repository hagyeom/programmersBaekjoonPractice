import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> stack=new Stack();
        
        for(int element:arr){
            // peek() : 스택의 맨 위 객체를 가져옴(스택에서 제거 x)
            // 사이즈가 0인 경우 비어있어 비교 대상이 없음. 바로 push!
            if(stack.isEmpty()||element!=stack.peek())
                stack.push(element);
        }
        return stack.stream().mapToInt(element->element).toArray();
    }
}