class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        for (int i = 0; i < arr1.length; i++) {
            sb.append(arr1[i]).append(arr2[i]);
        }
        answer = sb.toString();
        return answer;
    }
}