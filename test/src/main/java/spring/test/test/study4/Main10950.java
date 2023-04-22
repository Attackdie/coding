package spring.test.test.study4;
import java.util.Scanner;
public class Main10950 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); // 테스트 케이스 개수 입력 받기

        for (int i = 0; i < T; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();

            System.out.println(A + B);
        }

        sc.close();
    }
}