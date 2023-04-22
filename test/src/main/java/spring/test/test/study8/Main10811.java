package spring.test.test.study8;

import java.util.Scanner;

public class Main10811 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[N];

        // 배열 초기화
        for (int i = 0; i < N; i++) {
            arr[i] = i + 1;
        }

        // 뒤집기 연산 수행
        for (int i = 0; i < M; i++) {
            int start = sc.nextInt() - 1;
            int end = sc.nextInt() - 1;

            while (start < end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }

        // 결과 출력
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}