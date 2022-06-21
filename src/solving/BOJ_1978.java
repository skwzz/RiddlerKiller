package solving;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 소수 찾기
 * https://www.acmicpc.net/problem/1978
 */
public class BOJ_1978 {
    static int[] arr = new int[1001];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int cnt = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int answer = 0;
        initArr();

        while(st.hasMoreTokens()){
            int n = Integer.parseInt(st.nextToken());
            if(arr[n] == 0){
                answer++;
            }
        }
        System.out.print(answer);
    }

    static void initArr(){
        arr[1] = 1;
        for(int i=2; i<=1000; i++){
            if(arr[i] == 1){
                continue;
            }
            for(int j=2; i*j<=1000; j++){
                arr[i*j]=1;
            }
        }
    }
}
