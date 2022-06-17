package programmers.kakao;

import java.util.ArrayList;
import java.util.regex.Pattern;

/**
 * 뉴스 클러스터링
 * https://programmers.co.kr/learn/courses/30/lessons/17677
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
