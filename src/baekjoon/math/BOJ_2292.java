package baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 벌집
 * https://www.acmicpc.net/problem/2292
 */
public class BOJ_2292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int target = Integer.parseInt(br.readLine()); // 1 ~ 10억
        int sum = 1;
        int answer = 0;

        while(true){
            sum = sum + (6*answer);
            if(target <= sum){
                break;
            }
            answer++;
        }
        System.out.println(answer+1);
    }
}
