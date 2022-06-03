package baekjoon.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[42];
        int answer = 0;
        for(int i=0; i<10; i++){
            int num = Integer.parseInt(br.readLine());
            if(arr[num%42] == 0){
                answer++;
            }
            arr[num%42]++;
        }
        System.out.println(answer);
    }
}
