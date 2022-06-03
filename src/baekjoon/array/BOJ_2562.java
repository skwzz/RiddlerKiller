package baekjoon.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int num = Integer.MIN_VALUE;
        int idx = 0;
        for(int i=0; i<9 ;i++){
            int cur = Integer.parseInt(br.readLine());
            if(num < cur){
                num = cur;
                idx = i+1;
            }
        }
        sb.append(num).append("\n").append(idx);
        System.out.println(sb);
    }
}
