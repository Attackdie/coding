package spring.test.test.study6;
import java.util.Scanner;

public class Main10871 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // N 입력받기
        int x = sc.nextInt(); // X 입력받기

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt(); // 정수 입력받기
            if (num < x) { // X보다 작은 수인 경우 출력
                System.out.print(num + " ");
            }
        }
    }
}
