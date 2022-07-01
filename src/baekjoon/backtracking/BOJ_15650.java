package baekjoon.backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * N과 M(2)
 * 문제 출처 https://www.acmicpc.net/problem/15650
 */
public class BOJ_15650 {
    static int[] arr;
    static boolean[] visit;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); // 1 ~ N
        int m = Integer.parseInt(st.nextToken()); // 자리수
        arr = new int[m];
        visit = new boolean[n+1];

        backtrack(n, m, 0);

    }
    public static void backtrack(int N, int M, int depth) {
        if(depth == M){ printArr(); return;}

        for(int i=1; i<=N; i++){
            if(depth!=0 && i<arr[depth-1]){
                continue;
            }
            if(!visit[i]){
                visit[i] = true;
                arr[depth] = i;
                backtrack(N, M, depth+1);
                visit[i] = false;
            }
        }
    }

    static void printArr(){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
