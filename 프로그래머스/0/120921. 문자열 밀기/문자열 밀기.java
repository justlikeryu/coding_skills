class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        
        String[] strA = A.split("");
        String[] strB = B.split("");
        
        if(A.equals(B)){
            answer = 0;
        } else {
            for(int i = 0; i < A.length(); i++){
               if (A.equals(B)) {
                    return answer; 
                }
                A = A.charAt(A.length() - 1) + A.substring(0, A.length() - 1); 
                answer++; 
            }
            answer = -1;
        }

        
        return answer;
    }
}