package baekjoon.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 피보나치 수 5
 * https://www.acmicpc.net/problem/10870
 */
public class BOJ_10870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int answer = fibonacci(n);
        System.out.println(answer);
    }

    static int fibonacci(int num){
        if(num<=1){
            return num;
        }else{
            return fibonacci(num-1) + fibonacci(num-2);
        }
    }
}
