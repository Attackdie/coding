package spring.test.test.study7;
import java.util.Scanner;

public class Main5597 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean[] students = new boolean[30];

        for (int i = 0; i < 28; i++) {
            int n = sc.nextInt();
            students[n-1] = true;
        }

        for (int i = 0; i < 30; i++) {
            if (!students[i]) {
                System.out.println(i+1);
            }
        }
    }
}
