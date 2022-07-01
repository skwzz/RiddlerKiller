package baekjoon.priorityqueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

/**
 * 최대 힙
 * 문제 출처 https://www.acmicpc.net/problem/11279
 */
public class BOJ_11279 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int operCnt = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> pq = new PriorityQueue<>((o1, o2) -> {
            return o2.compareTo(o1);
        });

        while(operCnt > 0){
            int n = Integer.parseInt(br.readLine());
            if(n==0){
                if(pq.isEmpty()){
                    sb.append("0").append("\n");
                }else{
                    sb.append(pq.poll()).append("\n");
                }
            }else{
                pq.add(n);
            }

            operCnt--;
        }
        System.out.print(sb);
    }
}
