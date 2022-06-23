package baekjoon.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 팩토리얼
 * https://www.acmicpc.net/problem/10872
 */
public class BOJ_10872 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int answer = factorial(n);
        System.out.println(answer);
    }

    static int factorial(int num){
        if(num<=1){
            return 1;
        }else{
            return num * factorial(num-1);
        }
    }
}
