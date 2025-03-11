class Solution {
    public String solution(String myString) {
        StringBuilder answer=new StringBuilder();
        for(char ch:myString.toCharArray()){
            if(ch=='a'){
                answer.append("A");
            }else if(Character.isUpperCase(ch)&&ch!='A'){
                answer.append(Character.toLowerCase(ch));
            }else{
                answer.append(ch);
            }
        }
        return answer.toString();
    }
}