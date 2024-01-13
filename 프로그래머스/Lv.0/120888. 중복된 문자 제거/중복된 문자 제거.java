class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        StringBuilder sb = new StringBuilder(my_string);
        for(int i = 0; i < sb.length(); i++){
            for(int j = 0; j < sb.length(); j++){
                if(sb.charAt(i) == sb.charAt(j) && i != j && i < j){
                    sb.deleteCharAt(j);
                    j--;
                }
            }
        }
        
        answer = sb.toString();
        
        return answer;
    }
}