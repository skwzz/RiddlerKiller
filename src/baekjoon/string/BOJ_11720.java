package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 숫자의 합
 * https://www.acmicpc.net/problem/11720
 */
public class BOJ_11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int len = Integer.parseInt(br.readLine());
        char[] arr = br.readLine().toCharArray();
        int sum = 0;

        for(char c: arr){
            sum += ((int)c - 48);
        }

        System.out.println(sum);

    }
}
