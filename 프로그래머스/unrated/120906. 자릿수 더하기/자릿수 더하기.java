import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String temp = Integer.toString(n);
        int[] digit = new int[temp.length()];
        for(int i = 0; i < temp.length(); i++){
            digit[i] = Character.getNumericValue(temp.charAt(i));
            answer += digit[i];
        }
        return answer;
    }
}