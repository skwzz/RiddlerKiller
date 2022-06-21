package baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 부녀회장이 될테야
 * https://www.acmicpc.net/problem/2775
 */
public class BOJ_2775 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int[][] arr = new int[15][14];
        for(int i=0; i<14; i++){
            arr[0][i] = i+1;
            arr[i+1][0] = 1;
        }
        for(int i=1; i<15; i++){
            for(int j=1; j<14; j++){
                arr[i][j] = arr[i-1][j] + arr[i][j-1];
            }
        }
        int testCase = Integer.parseInt(br.readLine());
        while(testCase > 0){
            int a = Integer.parseInt(br.readLine());
            int b = Integer.parseInt(br.readLine());

            System.out.println(arr[a][b-1]);

            testCase--;
        }
    }

    static void printArr(int[][] arr){
        System.out.println("======== PRINT ARR ==========");
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
