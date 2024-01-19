class Solution {
    public int solution(String s) {
        int answer = 0;
        
        String[] sArr = s.split(" ");
        for (int i = 0; i < sArr.length; i++) {
            try {
                answer += Integer.parseInt(sArr[i]);
            } catch (NumberFormatException e) {
                if (sArr[i].equals("Z")) {
                    answer -= Integer.parseInt(sArr[i - 1]);
                }
            }
        }
        
        return answer;
    }
}