import java.util.*;

class Solution {
    public String solution(String letter) {
        String answer = "";
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Map<String, String> morseMap = new HashMap<String, String>();
        for (int i = 0; i < morse.length; i++) {
            char c = (char) ('a' + i);
            morseMap.put(morse[i], String.valueOf(c));
        }   
        String[] words = letter.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            sb.append(morseMap.get(words[i]));
        }
        answer = sb.toString();
        return answer;
    }
}