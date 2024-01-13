import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        my_string = my_string.toLowerCase();
        
        char[] strChar = my_string.toCharArray();
        Arrays.sort(strChar);
        
        answer = String.valueOf(strChar);
        
        return answer;
    }
}