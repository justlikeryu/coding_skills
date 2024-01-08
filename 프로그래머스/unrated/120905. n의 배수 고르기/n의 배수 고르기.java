class Solution {
    public int[] solution(int n, int[] numlist) {
        int count = 0;
        for(int x : numlist){
            if(x % n == 0){
                count++;
            }
        }
        
        int[] answer = new int[count];
        int index = 0;
        for(int x : numlist){
            if(x % n == 0){
                answer[index++] = x;
            }
        }
        
        return answer;
    }
}