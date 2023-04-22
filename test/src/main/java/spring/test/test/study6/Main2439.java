package spring.test.test.study6;
import java.util.Scanner;

public class Main2439 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        for (int i = 1; i <= n; i++) {
            // 공백 출력
            for (int j = n - i; j > 0; j--) {
                System.out.print(" ");
            }

            // 별 출력
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }

            System.out.println(); // 줄바꿈
        }
    }
}
