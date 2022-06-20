package solving;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * ACM 호텔
 * https://www.acmicpc.net/problem/10250
 */
public class BOJ_10250 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int testCase = Integer.parseInt(br.readLine());
        while(testCase > 0){
            st = new StringTokenizer(br.readLine());
            int h = Integer.parseInt(st.nextToken()); // 높이
            int w = Integer.parseInt(st.nextToken()); // 넓이
            int n = Integer.parseInt(st.nextToken()); // 몇번째입장

            // 6 12 10 -> 402
            // 30 50 72 -> 1203
            int a = n%h;
            int b = n/h+1;
            if(a==0){
                a = h;
                b = n/h;
            }
            sb.append(String.valueOf(a));
            sb.append(String.format("%02d", b));
            sb.append("\n");
            testCase--;
        }
        System.out.print(sb);
    }
}
