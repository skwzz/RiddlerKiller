package solving;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        System.out.println(50/70.0);
        int n = Integer.parseInt(br.readLine());
        long[] arr = new long[n];
        int max =  Integer.MIN_VALUE;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            int k = Integer.parseInt(st.nextToken());
            arr[i] = k;
            if(max < k){
                max = k;
            }
        }
        System.out.println("MAX:"+max);
        int sum = 0;
        for(int i=0; i<n; i++){
            System.out.println((arr[i] / max));
            arr[i] = (arr[i] / max) * 100;
            sum += arr[i];
        }
    }
}
