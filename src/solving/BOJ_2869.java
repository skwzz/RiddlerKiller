package solving;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 달팽이는 올라가고 싶다
 * https://www.acmicpc.net/problem/2869
 */
public class BOJ_2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int haru = a - b;
        int des = c - a;
        int answer = 0;
        if(des % haru == 0){
            answer = (des / haru) + 1;
        }else {
            answer = (des / haru) + 2;
        }
        System.out.println(answer);
    }
}
