import java.util.regex.*;
import java.util.*;

class Solution {
    public int solution(String my_string) {
        Pattern pattern=Pattern.compile("\\d+"); // 숫자를 나타내는 정규식을 컴파일
        Matcher matcher=pattern.matcher(my_string);
        int sum=0;
        while(matcher.find()){
            // matcher.group()은 발견된 숫자 문자열 반환
            sum+=Integer.parseInt(matcher.group());
        }
        return sum;
    }
}