package spring.test.test.study8;

import java.util.Scanner;

public class Main1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] scores = new double[n];

        double max = 0;
        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextDouble();
            if (scores[i] > max) {
                max = scores[i];
            }
        }

        double sum = 0;
        for (int i = 0; i < n; i++) {
            scores[i] = scores[i] / max * 100;
            sum += scores[i];
        }

        double avg = sum / n;
        System.out.println(avg);
    }
}
