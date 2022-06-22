package baekjoon.primenumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * 소인수분해
 * https://www.acmicpc.net/problem/11653
 */
public class BOJ_11653 {
    static int[] arr = new int[10000001];
    static ArrayList<Integer> primes = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int num = Integer.parseInt(br.readLine());
        ArrayList<Integer> answer = new ArrayList<>();
        initArr();

        while(num>1){
            if(num % 2 == 0){
                answer.add(2);
                num/=2;
            }else{
                for(int i=0; i<primes.size(); i++){
                    if(num % primes.get(i) == 0){
                        answer.add(primes.get(i));
                        num /= primes.get(i);
                        break;
                    }
                }
            }
        }
        for(int i=0; i<answer.size(); i++){
            System.out.println(answer.get(i));
        }
    }

    static void initArr(){
        arr[1] = 1;
        for(int i=2; i<=10000000; i++){
            if(arr[i] == 1){
                continue;
            }
            primes.add(i);
            for(int j=2; i*j<=10000000; j++){
                arr[i*j]=1;
            }
        }
    }
}
