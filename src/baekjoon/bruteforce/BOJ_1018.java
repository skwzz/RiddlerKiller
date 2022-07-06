package baekjoon.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

/**
 * 체스판 다시 칠하기
 * 문제 출처 https://www.acmicpc.net/problem/1018
 */
public class BOJ_1018 {
    static int[][] arr;
    static int[][] arrZero = new int[8][8];
    static int[][] arrOne = new int[8][8];
    public static void main(String[] args) throws IOException {
        for(int i=0; i<8; i++){
            for(int j=0; j<8; j++){
                if(i%2==0){
                    if(j%2==0){
                        arrZero[i][j] = 0;
                        arrOne[i][j] = 1;
                    }else{
                        arrZero[i][j] = 1;
                        arrOne[i][j] = 0;
                    }
                }else{
                    if(j%2==0){
                        arrZero[i][j] = 1;
                        arrOne[i][j] = 0;
                    }else{
                        arrZero[i][j] = 0;
                        arrOne[i][j] = 1;
                    }
                }
            }
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        // b = 0
        // m = 1
        arr = new int[n][m];
        for(int i=0; i<n; i++){
            char[] cArr = br.readLine().toCharArray();
            for(int j=0; j<cArr.length; j++){
                arr[i][j] = (cArr[j]=='B') ? 0 : 1;
            }
        }
        int answer = Integer.MAX_VALUE;
        for(int i=0; i<=arr.length-8; i++){
            for(int j=0; j<=arr[0].length-8; j++){
                int temp = getTemp(i, j);
                answer = answer > temp ? temp : answer;
            }
        }
        System.out.println(answer);
    }

    static int getTemp(int n, int m){
        int first = arr[n][m];
        int[][] compareArr;
        int ret = 0;
        compareArr = first == 0 ? arrZero : arrOne;

        for(int i=0; i<8; i++){
            for(int j=0; j<8; j++){
                if(compareArr[i][j] != arr[n+i][m+j]){
                    ret++;
                }
            }
        }
        return Math.min(ret, 64-ret);
    }
}
