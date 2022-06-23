package baekjoon.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 재귀함수가 뭔가요?
 * https://www.acmicpc.net/problem/17478
 */
public class BOJ_17478 {
    static String postfix = "라고 답변하였지.";
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        System.out.println("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.");
        whatIsRecursion(cnt, cnt);
    }

    static void whatIsRecursion(int num, int depth){
        StringBuilder underscore = new StringBuilder();
        StringBuilder sb = new StringBuilder();
        for(int i=num-depth; i>0; i--){
            underscore.append("____");
        }
        sb.append(underscore).append("\"재귀함수가 뭔가요?\"").append("\n");
        if(depth==0){
            sb.append(underscore).append("\"재귀함수는 자기 자신을 호출하는 함수라네\"").append("\n");
            System.out.print(sb);
            System.out.println(underscore+postfix);
        }else{
            sb.append(underscore).append("\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.").append("\n");
            sb.append(underscore).append("마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.").append("\n");
            sb.append(underscore).append("그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"").append("\n");
            System.out.print(sb);
            whatIsRecursion(num, depth-1);
            System.out.println(underscore+postfix);
        }
    }
}
