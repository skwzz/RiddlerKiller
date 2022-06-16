package programmers.kakao;

import java.util.*;

/**
 * 신고 결과 받기
 * https://programmers.co.kr/learn/courses/30/lessons/92334
 */
public class KAKAO_GetReportResult {
    public static void main(String[] args) {
        String[] arr1_1 = new String[]{"muzi", "frodo", "apeach", "neo"};
        String[] arr1_2 = new String[]{"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        int k_1 = 2;
        String[] arr2_1 = new String[]{"con", "ryan"};
        String[] arr2_2 = new String[]{"ryan con", "ryan con", "ryan con", "ryan con"};
        int k_2 = 3;

        //solution(arr1_1, arr1_2, k_1);
        //solution(arr2_1, arr2_2, k_2);
        System.out.println(Arrays.toString(solution(arr1_1, arr1_2, k_1))); // [2,1,1,0]
        System.out.println(Arrays.toString(solution(arr2_1, arr2_2, k_2))); // [0,0]
    }

    static int[] solution(String[] id_list, String[] report, int k) {
        int idSize = id_list.length;
        int[] answer = new int[idSize];
        HashMap<String, Integer> hm = new HashMap<>(); // hm 은 이름 - 배열인덱스 매핑
        ArrayList<HashSet<String>> al = new ArrayList<>(idSize); // al 은 이름에 매칭된 인덱스 - 해당 유저 신고목록(Set)
        for(int i=0; i<idSize; i++){
            hm.put(id_list[i], i);
            al.add(new HashSet<>());
        }

        StringTokenizer st;
        for(int i=0; i<report.length; i++){
            st = new StringTokenizer(report[i]);
            String mem = st.nextToken();
            String target = st.nextToken();

            al.get(hm.get(target)).add(mem); // 신고를 당한 사람(target)의 인덱스 위치에 해당하는 Set에 신고자 (mem)목록으로 추가
        }

        for(int i=0; i<al.size(); i++){
            HashSet<String> hs = al.get(i);
            if(hs.size() >= k){ // 게시판 정지에 해당하는 신고 횟수를 넘을 경우
                hs.forEach(s -> {
                    answer[hm.get(s)]++; // 그 사람을 신고한 사람의 인덱스로 가서 +1 처리
                });
            }
        }
        return answer;
    }
}
