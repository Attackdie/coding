package spring.test.test.study7;
import java.util.Scanner;

public class Main10813 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] balls = new int[n+1];
        for (int i = 1; i <= n; i++) {
            balls[i] = i;
        }

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            int temp = balls[a];
            balls[a] = balls[b];
            balls[b] = temp;
        }

        for (int i = 1; i <= n; i++) {
            System.out.print(balls[i] + " ");
        }
    }
}
