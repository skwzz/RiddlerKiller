package baekjoon.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        while(n > 0){
            String str = br.readLine();
            char[] arr = str.toCharArray();
            int point = 0;
            int sum = 0;
            for(int i=0; i<arr.length; i++){
                char c = arr[i];
                if(c == 'O'){
                    sum += (++point);
                }else{
                    point = 0;
                }
            }
            sb.append(sum).append("\n");
            n--;
        }
        System.out.print(sb);
    }
}
