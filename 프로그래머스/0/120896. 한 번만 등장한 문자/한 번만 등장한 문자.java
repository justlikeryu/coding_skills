import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";
        StringBuilder sb = new StringBuilder();

        String[] sArr = s.split("");
        Arrays.sort(sArr);

        for (int i = 0; i < sArr.length; i++) {
            boolean unique = true;

            for (int j = 0; j < sArr.length; j++) {
                if (i != j && sArr[i].equals(sArr[j])) {
                    unique = false;
                    break;
                }
            }

            if (unique) {
                sb.append(sArr[i]);
            }
        }

        answer = sb.toString();
        return answer;
    }
}