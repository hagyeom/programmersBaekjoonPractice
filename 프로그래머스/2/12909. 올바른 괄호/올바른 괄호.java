import java.util.*;

class Solution {
    boolean solution(String s) {
        
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else { // ')' 닫는 괄호일때
                if (stack.isEmpty()) return false;
                char open = stack.pop();
                if (c == ')' && open != '(') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}