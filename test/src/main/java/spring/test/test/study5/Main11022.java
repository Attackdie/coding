package spring.test.test.study5;
import java.util.Scanner;
public class Main11022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // 테스트 케이스의 개수

        for (int i = 1; i <= t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int sum = a + b;

            System.out.println("Case #" + i + ": " + a + " + " + b + " = " + sum);
        }

        sc.close();
    }
}