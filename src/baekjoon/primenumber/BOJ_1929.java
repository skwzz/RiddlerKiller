package baekjoon.primenumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 소수 구하기
 * https://www.acmicpc.net/problem/1929
 */
public class BOJ_1929 {
    static int[] arr = new int[1000001];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        initArr();
        for(int i=a; i<=b; i++){
            if(arr[i] == 0){
                System.out.println(i);
            }
        }
    }

    static void initArr(){
        arr[1] = 1;
        for(int i=2; i<=1000000; i++){
            if(arr[i] == 1){
                continue;
            }
            for(int j=2; i*j<=1000000; j++){
                arr[i*j]=1;
            }
        }
    }
}
