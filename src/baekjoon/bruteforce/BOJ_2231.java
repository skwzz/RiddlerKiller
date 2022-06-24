package baekjoon.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 분해합
 * https://www.acmicpc.net/problem/2231
 */
public class BOJ_2231 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int answer = 0;
        for(int i=1; i<=n; i++){
            if(isBunhae(n, i)){
                answer = i;
                break;
            }
        }
        System.out.print(answer);
    }
    static boolean isBunhae(int target, int num){
        int sum = num;
        while(num>0){
            sum += num%10;
            num /=10;
        }
        if(sum == target){
            return true;
        }else{
            return false;
        }
    }
}
