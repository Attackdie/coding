package spring.test.test.study3;
import java.util.Scanner;
public class Main2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hour = sc.nextInt(); // 현재 시간
        int minute = sc.nextInt(); // 현재 분
        int cookTime = sc.nextInt(); // 요리 시간

        // 시간과 분 계산
        int totalMinute = minute + cookTime; // 총 분
        int addedHour = totalMinute / 60; // 추가될 시간
        int resultHour = (hour + addedHour) % 24; // 결과 시간
        int resultMinute = totalMinute % 60; // 결과 분

        // 결과 출력
        System.out.println(resultHour + " " + resultMinute);
    }
}