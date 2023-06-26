package spring.test.test.studysolution;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Solution {
    public String findHighestScorer(List<Map<String, Integer>> arr) {
        int[] aPattern = {1, 1, 1, 1, 1};
        int[] bPattern = {3, 3, 3};
        int[] cPattern = {5, 5};

        int aScore = calculateScore(arr, aPattern);
        int bScore = calculateScore(arr, bPattern);
        int cScore = calculateScore(arr, cPattern);

        int maxScore = Math.max(aScore, Math.max(bScore, cScore));

        StringBuilder result = new StringBuilder();

        if (maxScore == aScore) {
            result.append("a : ").append(maxScore).append(", ");
        }

        if (maxScore == bScore) {
            result.append("b : ").append(maxScore).append(", ");
        }

        if (maxScore == cScore) {
            result.append("c : ").append(maxScore).append(", ");
        }

        // 마지막 쉼표 제거
        result.deleteCharAt(result.length() - 2);

        return result.toString();
    }

    private int calculateScore(List<Map<String, Integer>> arr, int[] pattern) {
        int score = 0;
        int patternLength = pattern.length;

        for (Map<String, Integer> answer : arr) {
            int answerNumber = answer.get("answer");

            if (answerNumber == pattern[score % patternLength]) {
                score += answer.get("score");
            }
        }

        return score;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        List<Map<String, Integer>> arr1 = new ArrayList<>();
        arr1.add(Map.of("answer", 1, "score", 5));
        arr1.add(Map.of("answer", 3, "score", 3));
        arr1.add(Map.of("answer", 2, "score", 4));
        System.out.println(solution.findHighestScorer(arr1)); // a : 5

        List<Map<String, Integer>> arr2 = new ArrayList<>();
        arr2.add(Map.of("answer", 1, "score", 5));
        arr2.add(Map.of("answer", 5, "score", 5));
        arr2.add(Map.of("answer", 2, "score", 4));
        System.out.println(solution.findHighestScorer(arr2)); // a : 5, c : 5
    }
}
