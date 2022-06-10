package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 크로아티아 단어
 * https://www.acmicpc.net/problem/2941
 */
public class BOJ_2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int answer = 0;
        String str = br.readLine();
        String[] check = new String[]{"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        boolean trap;
        while(str.length() != 0){
            trap = false;
            for(int i=0; i<check.length; i++){
                if(str.startsWith(check[i])){
                    answer++;
                    str = str.substring(check[i].length());
                    trap = true;
                    break;
                }
            }

            if(!trap){
                answer++;
                str = str.substring(1);
            }
        }
        System.out.println(answer);
    }
}
