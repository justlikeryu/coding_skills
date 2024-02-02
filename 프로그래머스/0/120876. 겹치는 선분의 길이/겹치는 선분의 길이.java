class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        
        int[] count = new int[200];
        
        for(int[] i : lines){
            int start = i[0] + 100;
            int end = i[1] + 100;
            
            for(int j = start; j < end; j++){
                count[j] += 1;
            }
        }
        
        for(int x : count){
            if( x >= 2) answer++;
        }
        
        return answer;
    }
}