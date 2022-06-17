package programmers.monthly;

/**
 * 없는 숫자 더하기
 * https://programmers.co.kr/learn/courses/30/lessons/86051
 */
public class PGM_NoneNumberSum {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1,2,3,4,6,7,8,0};
        int[] arr2 = new int[]{5,8,4,0,6,7,9};
        System.out.println(solution(arr1));
        System.out.println(solution(arr2));
    }

    static int solution(int[] arr) {
        int answer = 45;
        for(int i=0; i<arr.length; i++){
            answer -= arr[i];
        }
        return answer;
    }
}
