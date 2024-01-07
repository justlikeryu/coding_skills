class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        String intString = my_string.replaceAll("[^0-9]","");
        
        for(int i = 0; i < intString.length(); i++){
            answer += Integer.parseInt(String.valueOf(intString.charAt(i)));
        }
        
        return answer;
    }
}