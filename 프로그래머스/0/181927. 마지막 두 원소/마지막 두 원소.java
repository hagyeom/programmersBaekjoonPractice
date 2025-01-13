class Solution {
    public int[] solution(int[] num_list) {
        // 마지막 원소와 그전 원소를 비교 
        int lastElement = num_list[num_list.length - 1]; 
        int secondLastElement = num_list[num_list.length - 2]; 
        // 조건에 따라 값을 추가 
        if (lastElement > secondLastElement) { lastElement -= secondLastElement; } 
        else { lastElement *= 2; } 
        // 새 배열 생성 및 값 추가 
        int[] answer = new int[num_list.length + 1]; 
        System.arraycopy(num_list, 0, answer, 0, num_list.length); 
        answer[answer.length - 1] = lastElement; 
        return answer;
    }
}