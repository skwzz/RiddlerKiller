package programmers.hash;

import java.util.HashMap;
/**
 * 완주하지 못한 선수
 * https://programmers.co.kr/learn/courses/30/lessons/42576
 */
public class PGM_Hash01 {
    public static void main(String[] args) {
        String[] pp1 = new String[]{"leo", "kiki", "eden"};
        String[] cp1 = new String[]{"eden", "kiki"};
        String[] pp2 = new String[]{"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] cp2 = new String[]{"josipa", "filipa", "marina", "nikola"};
        String[] pp3 = new String[]{"mislav", "stanko", "mislav", "ana"};
        String[] cp3 = new String[]{"stanko", "ana", "mislav"};
        System.out.println(hash01Solution(pp1, cp1));
        System.out.println(hash01Solution(pp2, cp2));
        System.out.println(hash01Solution(pp3, cp3));
    }

    static String hash01Solution(String[] pp, String[] cp) {
        HashMap<String, Integer> hm = new HashMap<>();
        for(String p : pp){
            hm.put(p, hm.getOrDefault(p, 0) + 1);
        }
        for(String c : cp){
            if(hm.get(c) == 1){
                hm.remove(c);
            }else{
                hm.put(c, hm.get(c) - 1);
            }
        }
        return hm.keySet().iterator().next();
    }
}
