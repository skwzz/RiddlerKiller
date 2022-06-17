package programmers.kakao;

import java.util.ArrayList;
import java.util.regex.Pattern;

/**
 * 뉴스 클러스터링
 * https://programmers.co.kr/learn/courses/30/lessons/17677
 */
/*
입력으로는 str1과 str2의 두 문자열이 들어온다. 각 문자열의 길이는 2 이상, 1,000 이하이다.
입력으로 들어온 문자열은 두 글자씩 끊어서 다중집합의 원소로 만든다. 이때 영문자로 된 글자 쌍만 유효하고, 기타 공백이나 숫자, 특수 문자가 들어있는 경우는 그 글자 쌍을 버린다. 예를 들어 "ab+"가 입력으로 들어오면, "ab"만 다중집합의 원소로 삼고, "b+"는 버린다.
다중집합 원소 사이를 비교할 때, 대문자와 소문자의 차이는 무시한다. "AB"와 "Ab", "ab"는 같은 원소로 취급한다.

입력으로 들어온 두 문자열의 자카드 유사도를 출력한다. 유사도 값은 0에서 1 사이의 실수이므로, 이를 다루기 쉽도록 65536을 곱한 후에 소수점 아래를 버리고 정수부만 출력한다.

str1	    str2	    answer
FRANCE	    french	    16384
handshake	shake hands	65536
aa1+aa2	    AAAA12	    43690
E=M*C^2	    e=m*c^2	    65536
 */
public class KAKAO_NewsClustering {
    public static void main(String[] args) {
        String str1_1 = "FRANCE";
        String str1_2 = "french";
        String str2_1 = "handshake";
        String str2_2 = "shake hands";
        String str3_1 = "aa1+aa2";
        String str3_2 = "AAAA12";
        String str4_1 = "E=M*C^2";
        String str4_2 = "e=m*c^2";

        System.out.println(solution(str1_1, str1_2));
        System.out.println(solution(str2_1, str2_2));
        System.out.println(solution(str3_1, str3_2));
        System.out.println(solution(str4_1, str4_2));
    }

    static int solution(String str1, String str2) {
        str1 = str1.toUpperCase();
        str2 = str2.toUpperCase();
        ArrayList<String> al1 = new ArrayList<>();
        ArrayList<String> al2 = new ArrayList<>();
        for(int i=0; i<str1.length()-1; i++){
            String temp = str1.substring(i, i+2);
            if(Pattern.matches("^[A-Z]*$", temp)){
                al1.add(temp);
            }
        }
        for(int i=0; i<str2.length()-1; i++){
            String temp = str2.substring(i, i+2);
            if(Pattern.matches("^[A-Z]*$", temp)){
                al2.add(temp);
            }
        }
        int gyo = 0;
        int hab = al1.size() + al2.size();
        for(int i=0; i<al1.size(); i++){
            Loop1:
            for(int j=al2.size()-1; j>=0; j--){
                if(al1.get(i).equals(al2.get(j))){
                    gyo++;
                    al2.remove(j);
                    break Loop1;
                }
            }
        }
        hab -= gyo;
        double temp = (hab != 0) ? (double)gyo/hab : 1;
        return (int)Math.floor(temp * 65536);
    }
}
