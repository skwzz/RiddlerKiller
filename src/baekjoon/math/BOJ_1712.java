package baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 손익분기점
 * https://www.acmicpc.net/problem/1712
 */
public class BOJ_1712 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        if(b >= c){
            System.out.print(-1);
            return;
        }
        int d = c - b;
        int e = a / d;
        System.out.println(e+1);
    }
}
