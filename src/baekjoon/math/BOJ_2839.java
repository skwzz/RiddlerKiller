package baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 설탕배달
 * https://www.acmicpc.net/problem/2839
 */
public class BOJ_2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int answer = 0;
        while(n > 0){
            if(5>n && n%3!=0){break;} // break point

            if(n%5 == 0){
                answer+=n/5;
                n=0;
                break;
            }

            n -= 3;
            answer++;
        }
        if(n==0){
            System.out.println(answer);
        }else{
            System.out.println(-1);
        }
    }
}
