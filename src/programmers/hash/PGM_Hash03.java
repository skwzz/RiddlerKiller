package programmers.hash;

import java.util.Arrays;
import java.util.HashMap;

/**
 * 폰켓몬
 * https://school.programmers.co.kr/learn/courses/30/lessons/1845
 */
public class PGM_Hash03 {
    /*
    [3,1,2,3]	    2
    [3,3,3,2,2,4]   3
    [3,3,3,2,2,2]	2
     */
    public static void main(String[] args) {
        int[] arr1 = new int[]{3, 1, 2 ,3};
        int[] arr2 = new int[]{3, 3, 3, 2, 2, 4};
        int[] arr3 = new int[]{3, 3, 3, 2, 2, 2};
        System.out.println(hash03Solution(arr1));
        System.out.println(hash03Solution(arr2));
        System.out.println(hash03Solution(arr3));
    }

    static int hash03Solution(int[] arr) {
        int target = arr.length/2;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            hm.put(arr[i], hm.getOrDefault(arr[i], 0)+1);
        }
        return Math.min(hm.size(), target);
    }
}
