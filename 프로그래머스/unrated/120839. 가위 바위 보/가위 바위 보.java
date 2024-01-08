class Solution {
    public String solution(String rsp) {
        String answer = "";
        
        String[] rspArr = rsp.split("");
        for(String x : rspArr){
            if(x.equals("2")){
                answer += "0";
            } else if (x.equals("0")){
                answer += "5";
            } else if (x.equals("5")){
                answer += "2";
            }
        }
        
        return answer;
    }
}