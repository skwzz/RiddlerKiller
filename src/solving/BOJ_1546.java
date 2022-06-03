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
        double[] arr = new double[n];
        double max =  -1;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            double k = Double.parseDouble(st.nextToken());
            arr[i] = k;
            if(max < k){
                max = k;
            }
        }
        double t = 0;
        for(int i=0; i<n; i++){
            t += (arr[i] / max) * 100;
        }
        System.out.println(t/n);
    }
}
