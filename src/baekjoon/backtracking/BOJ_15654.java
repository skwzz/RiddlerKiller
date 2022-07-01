package baekjoon.backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * N과 M(5)
 * 문제 출처 https://www.acmicpc.net/problem/15654
 */
public class BOJ_15654 {
    static int[] arr;
    static boolean[] visit;
    static int[] number;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); // 1 ~ N
        int m = Integer.parseInt(st.nextToken()); // 자리수
        arr = new int[m];
        number = new int[n];
        visit = new boolean[n];

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<number.length; i++){
            number[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(number);

        backtrack(n, m, 0);
        System.out.print(sb);
    }
    public static void backtrack(int N, int M, int depth) {
        if(depth == M){ printArr(); return;}

        for(int i=0; i<N; i++){
            if(!visit[i]){
                visit[i] = true;
                arr[depth] = number[i];
                backtrack(N, M, depth+1);
                visit[i] = false;
            }
        }
    }

    static void printArr(){
        for(int i=0; i<arr.length; i++){
            sb.append(arr[i]+" ");
        }
        sb.append("\n");
    }
}
