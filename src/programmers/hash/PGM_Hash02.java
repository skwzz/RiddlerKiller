package programmers.hash;

import java.util.Arrays;
import java.util.HashMap;

/**
 * 전화번호 목록
 * https://programmers.co.kr/learn/courses/30/lessons/42577
 */
public class PGM_Hash02 {
    /*
    ["119", "97674223", "1195524421"]	false
    ["123","456","789"]	                true
    ["12","123","1235","567","88"]	    false
     */
    public static void main(String[] args) {
        String[] arr1 = new String[]{"119", "97674223", "1195524421"};
        String[] arr2 = new String[]{"123","456","789"};
        String[] arr3 = new String[]{"12","123","1235","567","88"};
        System.out.println(hash02Solution(arr1));
        System.out.println(hash02Solution(arr2));
        System.out.println(hash02Solution(arr3));
    }

    static boolean hash02Solution(String[] arr) {
        Arrays.sort(arr);
        for(int i=0; i<arr.length-1; i++){
            if(arr[i+1].startsWith(arr[i])){
                return false;
            }
        }
        return true;
    }
}
