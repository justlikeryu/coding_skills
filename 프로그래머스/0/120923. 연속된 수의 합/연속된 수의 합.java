class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        
        if(num % 2 == 0){
            int middle = total / num;
            int start = middle - num / 2 + 1;
            
            for(int i = 0; i < num; i++){
                answer[i] = start + i;
            }
        } else if (num % 2 != 0){
            int middle = total / num;
            int start = middle - num / 2;
            
            for(int i = 0; i < num; i++){
                answer[i] = start + i;
            }
        }
        
        return answer;
    }
}