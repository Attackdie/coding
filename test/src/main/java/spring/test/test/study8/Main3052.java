package spring.test.test.study8;

import java.util.HashSet;
import java.util.Scanner;

public class Main3052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            int n = sc.nextInt();
            set.add(n % 42);
        }
        System.out.println(set.size());
    }
}