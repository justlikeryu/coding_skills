import java.util.Arrays;

class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer = Arrays.copyOf(numlist, numlist.length);

        for (int i = 0; i < answer.length - 1; i++) {
            for (int j = i + 1; j < answer.length; j++) {
                int distI = Math.abs(answer[i] - n);
                int distJ = Math.abs(answer[j] - n);

                if (distI == distJ && answer[i] < answer[j]) {
                    int temp = answer[i];
                    answer[i] = answer[j];
                    answer[j] = temp;
                } else if (distI > distJ) {
                    int temp = answer[i];
                    answer[i] = answer[j];
                    answer[j] = temp;
                }
            }
        }
        return answer;
    }
}