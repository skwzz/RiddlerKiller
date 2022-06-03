package baekjoon.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2577 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int[] arr = new int[10];
        int num = 1;
        for(int i=0; i<3 ;i++){
            num *= Integer.parseInt(br.readLine());
        }
        char[] cArr = Integer.toString(num).toCharArray();
        for(char c : cArr){
            arr[c-48]++;
        }
        for(int n : arr){
            System.out.println(n);
        }
    }
}
