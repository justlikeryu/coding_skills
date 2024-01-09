import java.util.Arrays;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int[] sortEmg = Arrays.copyOf(emergency, emergency.length);
        Arrays.sort(sortEmg);
        
        for(int i = 0; i < emergency.length; i++){
            for(int j = 0; j < sortEmg.length; j++){
                if(emergency[i] == sortEmg[j])
                answer[i] = sortEmg.length - j;
            }
        }
        return answer;
    }
}