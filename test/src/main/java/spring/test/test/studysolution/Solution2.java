package spring.test.test.studysolution;

public class Solution2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int result = solution(arr);
        System.out.println(result); // Output: 11
    }

    public static int solution(int[] arr) {
        int lcmSum = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int lcm = getLCM(arr[i], arr[j]);
                lcmSum += lcm;
            }
        }
        return lcmSum;
    }

    public static int getLCM(int a, int b) {
        return a * b / getGCD(a, b);
    }

    public static int getGCD(int a, int b) {
        if (b == 0)
            return a;
        return getGCD(b, a % b);
    }
}
