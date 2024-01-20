import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
    
        for(int num : array){
            char[] numChar = Integer.toString(num).toCharArray();
            for(char c : numChar){
                if(c == '7'){
                    answer++;
                }
            }
        }
        
        return answer;
    }
}