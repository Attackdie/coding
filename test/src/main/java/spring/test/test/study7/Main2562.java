package spring.test.test.study7;
import java.util.Scanner;

public class Main2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = Integer.MIN_VALUE; // 최댓값을 저장할 변수를 가장 작은 값으로 초기화
        int index = 0; // 최댓값이 몇 번째 수인지를 저장할 변수를 초기화

        for (int i = 1; i <= 9; i++) {
            int num = sc.nextInt(); // 수 입력받기

            // 입력받은 수가 현재까지의 최댓값보다 크다면 최댓값과 인덱스 갱신
            if (num > max) {
                max = num;
                index = i;
            }
        }

        System.out.println(max);
        System.out.println(index);
    }
}