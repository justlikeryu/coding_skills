class Solution {
    public String solution(int age) {
        String answer = "";
        
        String[] strAge = Integer.toString(age).split("");
        for(String x : strAge){
            if(x.equals("0")){
                answer += "a";
            }else if(x.equals("1")){
                answer += "b";
            }else if(x.equals("2")){
                answer += "c";
            }else if(x.equals("3")){
                answer += "d";
            }else if(x.equals("4")){
                answer += "e";
            }else if(x.equals("5")){
                answer += "f";
            }else if(x.equals("6")){
                answer += "g";
            }else if(x.equals("7")){
                answer += "h";
            }else if(x.equals("8")){
                answer += "i";
            }else if(x.equals("9")){
                answer += "j";
            }
        }
        
        return answer;
    }
}