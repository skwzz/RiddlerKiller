package baekjoon.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 별 찍기
 * 문제 출처 https://www.acmicpc.net/problem/{문제번호}
 */
public class BOJ_2447 {
    static int[][] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // init
        int n = Integer.parseInt(br.readLine());
        arr = new int[6561][6561];
        arr[0][0] = 1;
        
        // recursion
        solution(1, n);

        // print
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(arr[i][j]==1){
                    sb.append("*");
                }else{
                    sb.append(" ");
                }
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }

    static void solution(int depth, int dest){
        int cur = (int)Math.pow(3, depth);
        if(cur <= dest){ // recursion exit condition
            int jump = (int)Math.pow(3, depth-1); // 3
            for(int i=0; i<3; i++){
                for(int j=0; j<3; j++){
                    if(!(i==2&&j==2) && (i==j)){continue;} // i와 j가 같은 경우는 우측하단만 실행하도록

                    int targetI = 0;
                    int targetJ = 0;

                    int startI = i * jump;
                    int startJ = j * jump;

                    for(int ii=startI; ii<startI+jump; ii++){
                        for(int jj=startJ; jj<startJ+jump; jj++){
                            arr[ii][jj] = arr[targetI][targetJ++];
                        }
                        targetI++;
                        targetJ=0;
                    }
                }
            }
            solution(depth+1, dest);
        }
    }
}
