class Solution {
    public long solution(String numbers) {
        long answer = 0;
        
        String[] eng = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        for(int i = 0; i <= 9; i++){
            numbers = numbers.replaceAll(eng[i], Integer.toString(i));
        }
        
        answer = Long.parseLong(numbers);
        
        return answer;
    }
}