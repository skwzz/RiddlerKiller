package baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 분수찾기
 * https://www.acmicpc.net/problem/1193
 */
public class BOJ_1193 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int target = Integer.parseInt(br.readLine());
        int a = 1;
        int b = 1;
        int sum = 0;
        int loopCnt = 1;
        while(true){
            sum += loopCnt;
            if(sum >= target){
                break;
            }
            loopCnt++;
        }
        int flag = 0; // 0: A가 위에서 내려옴, 1: B가 위에서 내려옴
        if(loopCnt%2 != 0){
            b = loopCnt;
            flag = 1;
        }else{
            a = loopCnt;
        }
        while(sum - target > 0){
            if(flag == 1){
                b--;
                a++;
            }else{
                a--;
                b++;
            }
            target++;
        }

        System.out.println(a+"/"+b);
    }
}
