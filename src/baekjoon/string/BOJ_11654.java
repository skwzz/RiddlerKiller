package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 아스키 코드
 * https://www.acmicpc.net/problem/11654
 */
public class BOJ_11654 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int c = br.readLine().charAt(0);
        System.out.println(c);
    }
}
