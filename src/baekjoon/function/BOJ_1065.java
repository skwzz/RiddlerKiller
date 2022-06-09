package baekjoon.function;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 한수
 * https://www.acmicpc.net/problem/1065
 */
public class BOJ_1065 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int answer = 0;
        if(n<100){
            answer = n;
        }else{
            for(int i=n; i>=100; i--){
                if(isHansu(i)){
                    answer++;
                }
            }
            answer += 99;
        }
        System.out.println(answer);
    }

    static boolean isHansu(int n){
        boolean ret = true;
        int cha = 10;
        int back = -1;
        int front = -1;
        while(n>0){
            front = n % 10;
            if(back != -1){
                int t = front - back;
                if(cha != 10 && t != cha){
                    ret = false;
                    break;
                }
                cha = t;
            }
            back = front;
            n /= 10;
        }
        return ret;
    }
}
