package programmers.kakao;

import java.util.Arrays;

/**
 * 로또의 최고 순위와 최저 순위
 * https://programmers.co.kr/learn/courses/30/lessons/77484
 */
public class KAKAO_NumberStringWord {
    public static void main(String[] args) {
        String str1 = "one4seveneight";
        String str2 = "23four5six7";
        String str3 = "2three45sixseven";
        String str4 = "123";
        System.out.println(solution(str1));
        System.out.println(solution(str2));
        System.out.println(solution(str3));
        System.out.println(solution(str4));
    }


    static int solution(String str) {
        String[] arr = new String[]{"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for(int i=0; i<arr.length; i++){
            str = str.replaceAll(arr[i], Integer.toString(i));
        }
        return Integer.valueOf(str);
    }
}
