package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 알파벳 찾기
 * https://www.acmicpc.net/problem/10809
 */
public class BOJ_10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] arr = br.readLine().toCharArray();
        int[] alpha = new int[26];

        for(int i=0; i<arr.length; i++){
            int t = arr[i] - 97;
            if(alpha[t] == 0){
                alpha[t] = (i+1);
            }
        }
        for(int i=0; i<alpha.length; i++){
            System.out.print(alpha[i]-1+" ");
        }
    }
}
