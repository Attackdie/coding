package spring.test.test.study11;
import java.util.Scanner;
//문자열 반복
//문자열 S를 입력받은 후에, 각 문자를 R번 반복해 새 문자열 P를 만든 후 출력하는 프로그램을 작성하시오. 즉, 첫 번째 문자를 R번 반복하고, 두 번째 문자를 R번 반복하는 식으로 P를 만들면 된다. S에는 QR Code "alphanumeric" 문자만 들어있다.
//
//QR Code "alphanumeric" 문자는 0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ\$%*+-./: 이다.

//입력
//첫째 줄에 테스트 케이스의 개수 T(1 ≤ T ≤ 1,000)가 주어진다. 각 테스트 케이스는 반복 횟수 R(1 ≤ R ≤ 8), 문자열 S가 공백으로 구분되어 주어진다. S의 길이는 적어도 1이며, 20글자를 넘지 않는다.

//출력
//각 테스트 케이스에 대해 P를 출력한다.
public class Main2675 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt(); // 테스트 케이스 개수 입력 받기

        for (int i = 0; i < testCase; i++) {
            int repeat = scanner.nextInt(); // 반복 횟수 입력 받기
            String input = scanner.next(); // 문자열 입력 받기

            for (int j = 0; j < input.length(); j++) {
                for (int k = 0; k < repeat; k++) {
                    System.out.print(input.charAt(j));
                }
            }
            System.out.println(); // 줄 바꿈
        }

        scanner.close(); // 스캐너 닫기
    }
}
