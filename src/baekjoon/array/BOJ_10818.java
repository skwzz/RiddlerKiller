package baekjoon.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        while(st.hasMoreTokens()){
            int num = Integer.parseInt(st.nextToken());
            if(max < num){
                max = num;
            }
            if(min > num){
                min = num;
            }
        }

        sb.append(min).append(" ").append(max);
        System.out.print(sb);
    }
}
