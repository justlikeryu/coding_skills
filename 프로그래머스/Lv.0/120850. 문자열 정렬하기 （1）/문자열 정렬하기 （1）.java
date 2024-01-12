import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        int[] answer = {};
        
        String intStr = my_string.replaceAll("[^0-9]","");
        char[] intChar = intStr.toCharArray();
        Arrays.sort(intChar);
        
        answer = new int[intChar.length];
        for(int i = 0; i < answer.length; i++){
            answer[i] = Character.getNumericValue(intChar[i]);
        }
        
        return answer;
    }
}