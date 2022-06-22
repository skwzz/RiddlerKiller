package baekjoon.primenumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * 골드바흐의 추측
 * https://www.acmicpc.net/problem/9020
 */
public class BOJ_9020 {
    static int[] arr = new int[10001];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        initArr();
        int testCase = Integer.parseInt(br.readLine());
        while(testCase>0){
            int target = Integer.parseInt(br.readLine());
            for(int i=target/2; i>=0; i--){
                int a = i;
                if(arr[i]==0 && arr[target-i] == 0){
                    int b = target-i;
                    sb.append(a+" "+b).append("\n");
                    break;
                }
            }
            testCase--;
        }
        System.out.print(sb);
    }

    static void initArr(){
        arr[1] = 1;
        for(int i=2; i<=10000; i++){
            if(arr[i] == 1){
                continue;
            }
            for(int j=2; i*j<=10000; j++){
                arr[i*j]=1;
            }
        }
    }
}
