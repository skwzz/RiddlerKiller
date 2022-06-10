package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 다이얼
 * https://www.acmicpc.net/problem/5622
 */
public class BOJ_5622 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int point[] = new int[]{3, 3, 3, 4, 4, 4, 5 ,5, 5, 6, 6, 6, 7, 7, 7, 8, 8, 8, 8, 9, 9, 9, 10, 10, 10, 10};
        char[] arr = br.readLine().toCharArray();
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            int c = arr[i]-65;
            sum += point[c];
        }
        System.out.println(sum);
    }
}
