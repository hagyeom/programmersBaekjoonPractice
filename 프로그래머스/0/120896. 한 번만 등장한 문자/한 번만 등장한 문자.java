import java.util.*;

class Solution {
    public String solution(String s) {
        Map<Character, Integer> countMap = new HashMap<>();
        
        // 각 문자의 등장 횟수 세기
        for (char c : s.toCharArray()) {
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }
        
        List<Character> singleChars = new ArrayList<>();
        
        // 한 번만 등장한 문자 리스트에 담기
        for (char c : countMap.keySet()) {
            if (countMap.get(c) == 1) {
                singleChars.add(c);
            }
        }
        
        // 사전 순 정렬
        Collections.sort(singleChars);
        
        // 리스트를 문자열로 변환
        StringBuilder sb = new StringBuilder();
        for (char c : singleChars) {
            sb.append(c);
        }
        
        return sb.toString();
    }
}