package spring.test.test.studysolution;

public class Solution3 {
    public static void main(String[] args) {
        int a1 = 5;
        int result1 = solution(a1);
        System.out.println("a: " + a1 + " → " + result1);

        int a2 = 10;
        int result2 = solution(a2);
        System.out.println("a: " + a2 + " → " + result2);

        int a3 = 30;
        int result3 = solution(a3);
        System.out.println("a: " + a3 + " → " + result3);
    }

    public static int solution(int a) {
        int sum = 0;

        for (int num = 2; num <= a; num++) {
            boolean isPrime = true;

            // 소수 판별
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                sum += num;
            }
        }

        return sum;
    }
}

