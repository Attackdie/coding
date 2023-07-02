package spring.test.test.study10;
//아스키 코드
//알파벳 소문자, 대문자, 숫자 0-9중 하나가 주어졌을 때, 주어진 글자의 아스키 코드값을 출력하는 프로그램을 작성하시오.

//입력
//알파벳 소문자, 대문자, 숫자 0-9 중 하나가 첫째 줄에 주어진다.

//출력
//입력으로 주어진 글자의 아스키 코드 값을 출력한다.
import java.util.Scanner;
// java.util.Scanner 클래스를 import한다

public class Main11654 {
    // 접근제어자 public으로 Main class를 선언한다.
    public static void main(String[] args) {
        // 접근제어자 public으로 메모리에 상주하게 리턴값이 없이 main 함수를 선언한다
        Scanner in = new Scanner(System.in);
        // Scanner 객체 in를 선언한다.
        int ch = in.next().charAt(0);
		/* 값을 입력받아 문자열을 문자로 변환하고 그 값은
		int 타입 변수에 저장한다 이로서 문자가 아스키 코드로 출력되게 된다. */
        System.out.print(ch);
        // int형 변수 ch를 출력한다.
    }
}