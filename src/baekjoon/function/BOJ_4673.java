package baekjoon.function;

import java.io.IOException;

public class BOJ_4673 {
    public static void main(String[] args) throws IOException {
        int[] arr = new int[10001];
        for(int i=1; i<=10000; i++){
            if(arr[i] == 0){
                System.out.println(i);
            }
            int next = getNext(i);
            if(next <= 10000){
                arr[next]++;
            }
        }
    }

    static int getNext(int x){
        int sum = 0;
        sum += x;
        while(x > 0){
            int a = x % 10;
            sum += a;
            x /= 10;
        }
        return sum;
    }
}
