package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 그룹 단어 체커
 * https://www.acmicpc.net/problem/1316
 */
public class BOJ_1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        int answer = 0;

        while(testCase > 0){
            String str = br.readLine();
            if(isGroupWord(str)){
                answer++;
            }
            testCase--;
        }
        System.out.println(answer);
    }
    static boolean isGroupWord(String str){
        char[] arr = str.toCharArray();
        int[] point = new int[26];
        for(int i=0; i<arr.length; i++){
            int c = arr[i] - 97;
            if(i==0){
                point[c]++;
            }else{
                if(arr[i-1] != arr[i]){
                    if(point[c]!=0){
                        return false;
                    }else{
                        point[c]++;
                    }
                }
            }
        }
        return true;
    }
}
