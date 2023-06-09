package spring.test.test.study12;

//바구니 순서 바꾸기
//도현이는 바구니를 총 N개 가지고 있고, 각각의 바구니에는 1번부터 N번까지 번호가 순서대로 적혀져 있다. 바구니는 일렬로 놓여져 있고, 가장 왼쪽 바구니를 1번째 바구니, 그 다음 바구니를 2번째 바구니, ..., 가장 오른쪽 바구니를 N번째 바구니라고 부른다.
//
//도현이는 앞으로 M번 바구니의 순서를 회전시키려고 만들려고 한다. 도현이는 바구니의 순서를 회전시킬 때, 순서를 회전시킬 범위를 정하고, 그 범위 안에서 기준이 될 바구니를 선택한다. 도현이가 선택한 바구니의 범위가 begin, end이고, 기준이 되는 바구니를 mid라고 했을 때, begin, begin+1, ..., mid-1, mid, mid+1, ..., end-1, end 순서로 되어있는 바구니의 순서를 mid, mid+1, ..., end-1, end, begin, begin+1, ..., mid-1로 바꾸게 된다.
//
//바구니의 순서를 어떻게 회전시킬지 주어졌을 때, M번 바구니의 순서를 회전시킨 다음, 바구니에 적혀있는 번호를 가장 왼쪽 바구니부터 출력하는 프로그램을 작성하시오.

//입력
//첫째 줄에 N (1 ≤ N ≤ 100)과 M (1 ≤ M ≤ 100)이 주어진다.
//
//둘째 줄부터 M개의 줄에는 바구니의 순서를 바꾸는 만드는 방법이 주어진다. 방법은 i, j, k로 나타내고, 왼쪽으로부터 i번째 바구니부터 j번째 바구니의 순서를 회전시키는데, 그 때 기준 바구니는 k번째 바구니라는 뜻이다. (1 ≤ i ≤ k ≤ j ≤ N)
//
//도현이는 입력으로 주어진 순서대로 바구니의 순서를 회전시킨다.

//출력
//모든 순서를 회전시킨 다음에, 가장 왼쪽에 있는 바구니부터 바구니에 적혀있는 순서를 공백으로 구분해 출력한다.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

interface Main10182 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]), M = Integer.parseInt(input[1]);
        List<Integer> list = new ArrayList<Integer>();

        for(int i=0; i< N; i++) {
            list.add(i+1);
        }

        int i, j, k;
        for(int a=0; a < M; a++) {
            input = br.readLine().split(" ");
            i = Integer.parseInt(input[0]);
            j = Integer.parseInt(input[1]);
            k = Integer.parseInt(input[2]);

            int val = list.get(i-1);
            int end = list.get(k-1);

            while(val != end) {
                list.remove(i-1);
                list.add(j-1, val);
                val = list.get(i-1);
            }
        }

        for(int a=0; a< N; a++) {
            sb.append(list.get(a) + " ");
        }

        System.out.println(sb);
    }
}
