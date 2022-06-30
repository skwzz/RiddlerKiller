package solving;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

/**
 * 	최소 힙
 * 문제 출처 https://www.acmicpc.net/problem/1927
 */
public class BOJ_1927 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int operCnt = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> pq = new PriorityQueue<>((o1, o2) -> {
            return o1.compareTo(o2);
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
