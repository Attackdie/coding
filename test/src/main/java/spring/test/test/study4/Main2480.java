package spring.test.test.study4;
import java.util.Scanner;
public class Main2480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int result = 0;

        if(a == b && b == c) { // 모두 같은 경우
            result = 10000 + (a * 1000);
        } else if(a == b || a == c) { // 두 개의 눈이 같은 경우 1
            result = 1000 + (a * 100);
        } else if(b == c) { // 두 개의 눈이 같은 경우 2
            result = 1000 + (b * 100);
        } else { // 모두 다른 경우
            result = Math.max(Math.max(a, b), c) * 100;
        }

        System.out.println(result);
    }
}