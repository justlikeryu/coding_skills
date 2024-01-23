class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 0;

        for (int i = 0; i < dic.length; i++) {
            String word = dic[i];

            boolean match = true;
            for (int j = 0; j < spell.length; j++) {
                if (!word.contains(spell[j])) {
                    match = false;
                    answer = 2;
                    break;
                }
            }

            if (match) {
                answer = 1;
                break; 
            }
        }
        
        return answer;
    }
}