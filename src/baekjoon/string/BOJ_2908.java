package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 상수
 * https://www.acmicpc.net/problem/2908
 */
public class BOJ_2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        StringBuilder a = new StringBuilder(st.nextToken());
        StringBuilder b = new StringBuilder(st.nextToken());
        char[] aArr = a.toString().toCharArray();
        char[] bArr = b.toString().toCharArray();

        for(int i=2; i>=0; i--){
            if(aArr[i] > bArr[i]){
                System.out.println(a.reverse());
                break;
            }else if(aArr[i] < bArr[i]){
                System.out.println(b.reverse());
                break;
            }
        }
    }
}
