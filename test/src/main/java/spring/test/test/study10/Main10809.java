package spring.test.test.study10;

//알파벳 찾기
//알파벳 소문자로만 이루어진 단어 S가 주어진다. 각각의 알파벳에 대해서, 단어에 포함되어 있는 경우에는 처음 등장하는 위치를, 포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오.

//입력
//첫째 줄에 단어 S가 주어진다. 단어의 길이는 100을 넘지 않으며, 알파벳 소문자로만 이루어져 있다.

//출력
//각각의 알파벳에 대해서, a가 처음 등장하는 위치, b가 처음 등장하는 위치, ... z가 처음 등장하는 위치를 공백으로 구분해서 출력한다.
//
//만약, 어떤 알파벳이 단어에 포함되어 있지 않다면 -1을 출력한다. 단어의 첫 번째 글자는 0번째 위치이고, 두 번째 글자는 1번째 위치이다.
import java.util.*;

public class Main10809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next(); // 입력받은 문자열
        int[] alphabet = new int[26]; // 알파벳 개수만큼 배열 생성

        // 배열을 -1로 초기화
        Arrays.fill(alphabet, -1);

        // 문자열의 각 문자를 확인하여 인덱스 저장
        for (int i = 0; i < word.length(); i++) {
            int index = word.charAt(i) - 'a';
            if (alphabet[index] == -1) {
                alphabet[index] = i;
            }
        }

        // 결과 출력
        for (int i = 0; i < alphabet.length; i++) {
            System.out.print(alphabet[i] + " ");
        }
    }
}
