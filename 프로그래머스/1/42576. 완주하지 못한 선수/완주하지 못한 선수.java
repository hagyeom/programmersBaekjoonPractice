import java.util.*;

class Solution {
        public String solution(String[] participant, String[] completion) {
            HashMap<String, Integer> map = new HashMap<>();

            // 참가자의 이름을 HashMap에 추가하고 횟수를 셉니다.
            for (String p : participant) {
                map.put(p, map.getOrDefault(p, 0) + 1);
            }

            // 완주한 참가자의 이름을 HashMap에서 감소시킵니다.
            for (String c : completion) {
                map.put(c, map.get(c) - 1);
            }

            // 값이 0이 아닌 이름이 완주하지 못한 사람입니다.
            for (String p : participant) {
                if (map.get(p) != 0) {
                    return p;
                }
            }

            return "";
        }
    }