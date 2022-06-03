package baekjoon.function;

public class BOJ_15596 {
    public static void main(String[] args) {

    }
    long sum(int[] a) {
        long ans = 0;
        for(int n : a){
            ans += n;
        }
        return ans;
    }
}
