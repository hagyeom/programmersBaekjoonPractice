class Solution {
    // 주어진 배열에서 divisor로 나누어 떨어지는 요소를 찾는 메서드
    public int[]findDivisionNumbers(int[]arr,int divisor){
        int count=0;
        for(int num:arr){
            if(num%divisor==0){
                count++;
            }
        }
        
        if(count==0){
            return new int[]{-1};
        }
        
        int[]divisibleNumbers=new int[count];
        int index=0;
        for(int num:arr){
            if(num%divisor==0){
                divisibleNumbers[index++]=num;
            }
        }
        
        return divisibleNumbers;
    }
    
    // 배열을 오름차순으로 정렬하는 메서드
    public void sortArray(int[]array){
        for(int i=0;i<array.length-1;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i]>array[j]){
                    int temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
    }
    
    public int[] solution(int[] arr, int divisor) {
        int[] answer = findDivisionNumbers(arr,divisor);
        
        if(answer.length==1&&answer[0]==-1){
            return answer;
        }
        
        sortArray(answer);
        
        return answer;
    }
}
