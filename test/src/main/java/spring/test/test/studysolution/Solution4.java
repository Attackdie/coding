package spring.test.test.studysolution;

import java.util.ArrayList;
import java.util.List;

class Student {
    String name;
    int score;
    int absent;

    Student(String name, int score, int absent) {
        this.name = name;
        this.score = score;
        this.absent = absent;
    }
}

public class Solution4 {
    public static void main(String[] args) {
        // 학생 데이터 생성
        List<Student> students = new ArrayList<>();
        students.add(new Student("홍길동", 95, 1));
        students.add(new Student("춘향이", 72, 0));
        students.add(new Student("심청이", 85, 3));
        students.add(new Student("심봉사", 90, 4));
        students.add(new Student("콩쥐", 65, 0));
        students.add(new Student("팥쥐", 52, 1));

        // 등급 매기기 및 결과 출력
        for (Student student : students) {
            String grade = getGrade(student.score, student.absent);
            System.out.println("Name: " + student.name + ", Grade: " + grade);
        }
    }

    // 등급을 계산하는 메서드
    private static String getGrade(int score, int absent) {
        if (absent >= 4) {
            return "F";
        } else if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else if (score >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
}
