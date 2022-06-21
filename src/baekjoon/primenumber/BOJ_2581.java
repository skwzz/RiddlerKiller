package baekjoon.primenumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 소수
 * https://www.acmicpc.net/problem/2581
 */
public class BOJ_2581 {
    static int[] arr = new int[10001];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int answer = 0;
        initArr();

        int min = 0;
        int sum = 0;
        for(int i=a; i<=b; i++){
            if(arr[i] == 0){
                if(min==0){
                    min = i;
                }
                sum+=i;
            }
        }
        if(sum==0){
            System.out.println(-1);
        }else{
            System.out.println(sum);
            System.out.println(min);
        }
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
