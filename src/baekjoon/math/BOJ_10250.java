package baekjoon.math;

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

            int a = n%h;   //층에 대한 호수
            int b = n/h+1; //특정 층의 왼쪽부터 호수
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
