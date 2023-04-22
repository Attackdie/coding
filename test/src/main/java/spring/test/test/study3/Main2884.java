package spring.test.test.study3;
import java.util.Scanner;
public class Main2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();

        // 45분 빼기
        M -= 45;

        // 만약 분이 음수이면 시간에서 1시간을 빼고 분을 60분 더해줌
        if (M < 0) {
            H -= 1;
            M += 60;
        }

        // 만약 시간이 음수이면 24를 더해줌
        if (H < 0) {
            H += 24;
        }

        System.out.println(H + " " + M);

        sc.close();
    }
}