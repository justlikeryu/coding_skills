class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        
        String kStr = Integer.toString(k);
        for(int num = i; num <= j; num++){
            answer += count(num, k);
        }
        
        return answer;
    }
    
    public int count(int num, int digit){
        int count = 0;
        
        while(num > 0){
            if(num % 10 == digit){
                count++;
            }
            num /= 10;
        }
        return count;
    }
}