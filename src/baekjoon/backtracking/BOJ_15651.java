package baekjoon.backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * N과 M(3)
 * 문제 출처 https://www.acmicpc.net/problem/15651
 */
public class BOJ_15651 {
    static int[] arr;
    static boolean[] visit;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); // 1 ~ N
        int m = Integer.parseInt(st.nextToken()); // 자리수
        arr = new int[m];
        visit = new boolean[n+1];

        backtrack(n, m, 0);
        System.out.print(sb);
    }
    public static void backtrack(int N, int M, int depth) {
        if(depth == M){ printArr(); return;}

        for(int i=1; i<=N; i++){
            arr[depth] = i;
            backtrack(N, M, depth+1);
        }
    }

    static void printArr(){
        for(int i=0; i<arr.length; i++){
            sb.append(arr[i]+" ");
        }
        sb.append("\n");
    }
}
