import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        int B=sc.nextInt();
        int C=sc.nextInt();
        int[]arr=new int[10];
        int result=A*B*C;
        while(result>0){ // 0이 될 때까지 나누기
            arr[result%10]++; // 나머지를 인덱스로 사용
            // result % 10은 result의 마지막 자릿수를 구하는 연산입니다. 
            // 예를 들어, result가 123이면 result % 10은 3이 됩니다. 
            // 이 값을 배열 arr의 인덱스로 사용하여 해당 인덱스의 값을 1 증가시킵니다. 
            // 그런 다음 result를 10으로 나누어 마지막 자릿수를 제거합니다.
            // 이 과정을 반복하여 모든 자릿수를 처리합니다.
            result/=10; // 10으로 나누기
        }
        for(int i=0;i<10;i++){
            System.out.println(arr[i]);
        }
        sc.close();
    }
}
