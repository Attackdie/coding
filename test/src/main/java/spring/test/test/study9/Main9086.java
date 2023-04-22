package spring.test.test.study9;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main9086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            String tempStr = br.readLine();
            System.out.print(tempStr.charAt(0));
            System.out.printf(tempStr.charAt(tempStr.length() - 1) + "\n");
        }
    }
}