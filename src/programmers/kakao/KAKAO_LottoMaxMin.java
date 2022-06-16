package programmers.kakao;

import java.util.Arrays;

/**
 * 로또의 최고 순위와 최저 순위
 * https://programmers.co.kr/learn/courses/30/lessons/77484
 */
public class KAKAO_LottoMaxMin {
    public static void main(String[] args) {
        int[] arr1_1 = new int[]{44, 1, 0, 0, 31, 25};
        int[] arr1_2 = new int[]{31, 10, 45, 1, 6, 19};
        int[] arr2_1 = new int[]{0, 0, 0, 0, 0, 0};
        int[] arr2_2 = new int[]{38, 19, 20, 40, 15, 25};
        int[] arr3_1 = new int[]{45, 4, 35, 20, 3, 9};
        int[] arr3_2 = new int[]{20, 9, 3, 45, 4, 35};
        int[] arr4_1 = new int[]{1, 2, 3, 4, 5, 6};
        int[] arr4_2 = new int[]{7, 8, 9, 10, 11, 12};
        System.out.println(Arrays.toString(solution(arr1_1, arr1_2)));
        System.out.println(Arrays.toString(solution(arr2_1, arr2_2)));
        System.out.println(Arrays.toString(solution(arr3_1, arr3_2)));
        System.out.println(Arrays.toString(solution(arr4_1, arr4_2)));
    }


    static int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int matchCnt = 0;
        int zeroCnt = 0;
        int max = 0;
        int min = 0;
        for(int i=0; i<6; i++){
            if(lottos[i] == 0){
                zeroCnt++;
                continue;
            }
            for(int j=0; j<6; j++){
                if(lottos[i] == win_nums[j]){
                    matchCnt++;
                }
            }
        }
        int curRank = Math.abs(matchCnt - 6) + 1;
        max = curRank - zeroCnt > 6 ? 6 : curRank - zeroCnt;
        min = curRank > 6 ? 6 : curRank;
        answer[0] = max;
        answer[1] = min;
        return answer;
    }
}
