import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(String before, String after) {
        int answer = 0;

        if (check(before, after)) {
            answer = 1;
        }

        return answer;
    }

    private boolean check(String before, String after) {

        Map<Character, Integer> beforeMap = new HashMap<>();
        Map<Character, Integer> afterMap = new HashMap<>();

        for (char b : before.toCharArray()) {
            beforeMap.put(b, beforeMap.getOrDefault(b, 0) + 1);
        }

        for (char a : after.toCharArray()) {
            afterMap.put(a, afterMap.getOrDefault(a, 0) + 1);
        }

        return beforeMap.equals(afterMap);
    }
}