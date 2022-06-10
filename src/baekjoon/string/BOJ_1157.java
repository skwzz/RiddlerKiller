package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 단어 공부
 * https://www.acmicpc.net/problem/1157
 */
public class BOJ_1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int[] arr = new int[26];
        char[] str = br.readLine().toCharArray();
        int maxV = 0;
        int maxI = 0;
        int dupCnt = 0;

        for(int i=0; i<str.length; i++){
            // 97 122 소문자
            // 65 90 대문자
            int n = str[i];
            n = (n>=97) ? n-97 : n-65;

            arr[n]++;
            if(maxV < arr[n]){
                maxV = arr[n];
                maxI = n;
                dupCnt = 1;
            }else if(maxV == arr[n]){
                dupCnt++;
            }
        }
        if(dupCnt == 1){
            System.out.println((char)(maxI+65));
        }else{
            System.out.println("?");
        }
    }
}
