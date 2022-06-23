package baekjoon.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 블랙잭
 * https://www.acmicpc.net/problem/2798
 */
public class BOJ_2798 {
    /*
5 21
5 6 7 8 9
21

10 500
93 181 245 214 315 36 185 138 216 295
497
     */
    public static void main(String[] args) throws IOException {
        // INPUT, INIT
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int cardNum = Integer.parseInt(st.nextToken());
        int target = Integer.parseInt(st.nextToken());
        int[] arr = new int[cardNum];
        int answer = Integer.MIN_VALUE;
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<arr.length; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        //SOLUTION
        Loop1:
        for(int i=0; i<arr.length-2; i++){
            for(int j=i+1; j<arr.length-1; j++){
                for(int k=j+1; k<arr.length; k++){
                    int sum = arr[i] + arr[j] + arr[k];
                    if(sum == target){
                        answer = target;
                        break Loop1;
                    }else if(sum < target){
                        answer = Math.max(answer, sum);
                    }
                }
            }
        }
        System.out.println(answer);
    }
}
