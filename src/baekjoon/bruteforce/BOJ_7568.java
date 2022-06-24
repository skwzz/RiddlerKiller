package baekjoon.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 덩치
 * https://www.acmicpc.net/problem/7568
 */
public class BOJ_7568 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int cnt = Integer.parseInt(br.readLine());
        int[] arr1 = new int[cnt];
        int[] arr2 = new int[cnt];
        int[] answer = new int[cnt];
        for(int i=0; i<cnt; i++){
            st = new StringTokenizer(br.readLine());
            arr1[i] = Integer.parseInt(st.nextToken());
            arr2[i] = Integer.parseInt(st.nextToken());
        }
        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr2.length; j++){
                if(arr1[i] < arr1[j] && arr2[i] < arr2[j]){
                    answer[i]++;
                }
            }
        }
        for(int i=0; i<cnt; i++){
            System.out.print(answer[i]+1+" ");
        }

        /*
        A	(55, 185)	2
        B	(58, 183)	2
        C	(88, 186)	1
        D	(60, 175)	2
        E	(46, 155)	5
        5
        55 185
        58 183
        88 186
        60 175
        46 155
         */
    }
}
