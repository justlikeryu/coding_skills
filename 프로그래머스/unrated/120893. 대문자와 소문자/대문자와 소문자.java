import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        for(char x : my_string.toCharArray()){
            if(Character.isLowerCase(x)){
                answer += Character.toUpperCase(x);
            } else {
                answer += Character.toLowerCase(x);
            }
        }
        
        return answer;
    }
}