package programmers.monthly;

/**
 * 음양 더하기
 * https://programmers.co.kr/learn/courses/30/lessons/76501
 */
public class PGM_PlusMinusSum {
    public static void main(String[] args) {
        int[] arr1_1 = new int[]{4, 7, 12};
        boolean[] arr1_2 = new boolean[]{true, false, true};
        int[] arr2_1 = new int[]{1, 2, 3};
        boolean[] arr2_2 = new boolean[]{false, false, true};
        System.out.println(solution(arr1_1, arr1_2));
        System.out.println(solution(arr2_1, arr2_2));
    }

    static int solution(int[] arr, boolean[] oper) {
        int answer = 0;
        for(int i=0; i<arr.length; i++){
            if(oper[i]){
                answer += arr[i];
            }else{
                answer -= arr[i];
            }
        }
        return answer;
    }
}
