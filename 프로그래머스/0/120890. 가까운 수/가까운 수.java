class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            int difference = Math.abs(array[i] - n); 
            
            if (difference < min) {
                min = difference;
                answer = array[i];
            } else if (difference == min && array[i] < answer) {
                answer = array[i];
            }
        }

        return answer;
    }
}