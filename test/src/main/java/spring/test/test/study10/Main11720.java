package spring.test.test.study10;

//숫자의 합
//N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.

//입력
//첫째 줄에 숫자의 개수 N (1 ≤ N ≤ 100)이 주어진다. 둘째 줄에 숫자 N개가 공백없이 주어진다.

//출력
//입력으로 주어진 숫자 N개의 합을 출력한다.
import java.util.Scanner;

public class Main11720 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // 숫자열의 길이
        String s = scanner.next(); // 숫자열

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += s.charAt(i) - '0';
        }

        System.out.println(sum);
    }
}