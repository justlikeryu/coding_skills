class Solution {
    public String solution(String bin1, String bin2) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        int up = 0;
        
        int num1 = bin1.length() - 1;
        int num2 = bin2.length() - 1;
        
        while(num1 >= 0 || num2 >= 0 || up > 0){
            int digit1 = (num1 >= 0) ? bin1.charAt(num1--) - '0' : 0;
            int digit2 = (num2 >= 0) ? bin2.charAt(num2--) - '0' : 0;
            int sum = digit1 + digit2 + up;
            
            sb.insert(0, sum % 2);
            up = sum / 2;
        }
        
        answer = sb.toString();
        
        return answer;
    }
}