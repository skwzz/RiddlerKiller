package baekjoon.primenumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * 베르트랑 공준
 * https://www.acmicpc.net/problem/4948
 */
public class BOJ_4948 {
    static int[] arr = new int[246913]; /// 123456*2 (+1)
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str ="";
        initArr();

        while(!(str = br.readLine()).equals("0")){
            int a = Integer.parseInt(str);
            int b = a * 2;
            int answer = 0;
            for(int i=a+1; i<=b ;i++){
                if(arr[i]==0){
                    answer++;
                }
            }
            System.out.println(answer);
        }
    }

    static void initArr(){
        arr[1] = 1;
        for(int i=2; i<=246912; i++){
            if(arr[i] == 1){
                continue;
            }
            for(int j=2; i*j<=246912; j++){
                arr[i*j]=1;
            }
        }
    }
}
