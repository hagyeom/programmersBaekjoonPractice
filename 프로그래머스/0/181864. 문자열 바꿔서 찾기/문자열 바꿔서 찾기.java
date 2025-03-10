class Solution {
    public int solution(String myString, String pat) {
        // "A"를 "B"로, "B"를 "A"로 바꾸기
        StringBuilder swappedString=new StringBuilder();
        for(char c:myString.toCharArray()){
            if(c=='A'){
                swappedString.append('B');
            }else{
                swappedString.append('A');
            }
        }
        // 바꾼 문자열에서 pat가 존재하는지 확인
        if(swappedString.toString().contains(pat)){
            return 1;
        }else{
            return 0;
        }
    }
}