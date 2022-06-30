package solving;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

/**
 * 절대값 힙
 * 문제 출처 https://www.acmicpc.net/problem/11286
 */
public class BOJ_11286 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int operCnt = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>((o1, o2) -> {
            if(Math.abs(o1) > Math.abs(o2)){
                return 1;
            }else if(Math.abs(o1) == Math.abs(o2)){
                return o1.compareTo(o2);
            }else{
                return -1;
            }
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
