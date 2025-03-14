import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(); // 통화 횟수
        int y=0, m=0; // 영식 요금, 민식 요금
        for(int i=0;i<n;i++){
            int t=sc.nextInt(); // 통화 시간
            y+=((t/30)+1)*10; // 영식 요금
            m+=((t/60)+1)*15; // 민식 요금
        }
        if(y<m){ // 영식 요금이 더 싸면
            System.out.println("Y "+y);
        }else if(y>m){ // 민식 요금이 더 싸면
            System.out.println("M "+m);
        }else{ // 같으면
            System.out.println("Y M "+y);
        }
        sc.close();
    }
}