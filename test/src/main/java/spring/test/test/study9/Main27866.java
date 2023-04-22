package spring.test.test.study9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main27866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine().trim();
        int idx = Integer.parseInt(br.readLine());

        System.out.println(str.substring(idx-1, idx));
    }
}
