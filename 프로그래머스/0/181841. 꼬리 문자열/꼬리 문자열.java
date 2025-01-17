class Solution {
    public String solution(String[] str_list, String ex) {
        String answer = "";
        // 참조변수명.contains("비교문자열");
        // 문자열 포함 여부 확인하여 boolean 값을 리턴
        for(String str:str_list){
            if(!str.contains(ex)){
                answer+=str;
            }
        }
        return answer;
    }
}