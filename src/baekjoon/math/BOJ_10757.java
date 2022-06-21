package baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

/**
 * 큰 수 A + B
 * https://www.acmicpc.net/problem/10757
 */
public class BOJ_10757 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String a = st.nextToken();
        String b = st.nextToken();

        sol1(a, b);
        sol2(a, b);
    }

    static void sol2(String a, String b){
        StringBuilder sb = new StringBuilder();
        int[] arr1 = new int[10000];
        int[] arr2 = new int[10000];
        char[] ca1 = a.toCharArray();
        char[] ca2 = b.toCharArray();
        int maxSize = Math.max(ca1.length, ca2.length);
        int up = 0; // 10의자리 ㄱㄱ
        int idx = 0;
        for(int i=ca1.length-1; i>=0; i--){
            arr1[idx++] = ca1[i] - '0';
        }
        idx = 0;
        for(int i=ca2.length-1; i>=0; i--){
            arr2[idx++] = ca2[i] - '0';
        }

        for(int i=0; i<maxSize; i++){
            int n = arr1[i] + arr2[i] + up;
            if(n > 9){
                sb.insert(0, n-10);
                up = 1;
            }else{
                sb.insert(0, n);
                up = 0;
            }
        }
        if(up==1){
            sb.insert(0, 1);
        }
        System.out.print(sb);
    }

    static void sol1(String a, String b){
        BigInteger a1 = new BigInteger(a);
        BigInteger a2 = new BigInteger(b);

        System.out.println(a1.add(a2));
    }
}
