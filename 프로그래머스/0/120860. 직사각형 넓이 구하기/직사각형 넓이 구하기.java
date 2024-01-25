import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        
        Arrays.sort(dots, Comparator.comparingInt(a -> a[0]));
        Arrays.sort(dots, Comparator.comparingInt(a -> a[1]));
        
        int width = Math.abs(dots[1][0] - dots[0][0]);
        int length = Math.abs(dots[2][1] - dots[1][1]);
        
        answer = width * length;
        
        return answer;
    }
}