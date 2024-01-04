import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        Arrays.sort(array);
        int lengthArr = array.length;
        
        answer = array[lengthArr/2];
        
        return answer;
    }
}