package spring.test.test.study5;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main25314 {
    private void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n/4; i++) {
            sb.append("long ");
        }
        sb.append("int");
        System.out.println(sb);
    }
    public static void main(String[] args) throws Exception {
        new Main25314().solution();
    }
}




//BufferedReader 코드를 Scanner로 대체
/*
public class Main25314 {
    private void solution() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n/4; i++) {
            sb.append("long ");
        }
        sb.append("int");
        System.out.println(sb);
    }
    public static void main(String[] args) {
        new Main().solution();
    }
}*/
