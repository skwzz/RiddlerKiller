package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 문자열 반복
 * https://www.acmicpc.net/problem/2675
 */
public class BOJ_2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int testCase = Integer.parseInt(br.readLine());
        while(testCase > 0){
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            char[] arr = st.nextToken().toCharArray();

            for(int i=0; i<arr.length; i++){
                for(int j=0; j<n; j++){
                    sb.append(arr[i]);
                }
            }

            sb.append("\n");
            testCase--;
        }
        System.out.print(sb);

    }
}
