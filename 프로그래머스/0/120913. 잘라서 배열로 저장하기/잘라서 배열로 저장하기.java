class Solution {
    public String[] solution(String my_str, int n) {
        int arrayLength = my_str.length() % n == 0 ? my_str.length() / n : my_str.length() / n + 1;
        String[] answer = new String[arrayLength];

        for (int i = 0, j = 0; i < my_str.length() && j < arrayLength; i += n, j++) {
            int endIdx = Math.min(i + n, my_str.length());
            answer[j] = my_str.substring(i, endIdx);
        }

        return answer;
    }
}