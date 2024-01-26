class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        int[] sum = new int[score.length];
        
        for(int i = 0; i < score.length; i++){
            for(int j = 0; j < score[i].length; j++){
                sum[i] += score[i][j];
            }
        }
        
        for(int i = 0; i < sum.length; i++){
            int rank = 1;
            for(int j = 0; j < sum.length; j++){
                if(i != j && sum[i] < sum[j]){
                    rank++;
                }
            }
            answer[i] = rank;
        }

        return answer;
    }
}