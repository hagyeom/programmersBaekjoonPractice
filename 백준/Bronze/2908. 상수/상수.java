public class Main {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int a = Integer.parseInt(new StringBuilder(input[0]).reverse().toString()); // reverse() 는 StringBuilder 객체의
                                                                                    // 문자열을 뒤집는 메소드
        int b = Integer.parseInt(new StringBuilder(input[1]).reverse().toString());
        System.out.println(a > b ? a : b);
        sc.close();
    }
}
