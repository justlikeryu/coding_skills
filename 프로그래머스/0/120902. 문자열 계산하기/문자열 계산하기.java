class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] strArr = my_string.split(" ");
        answer += Integer.parseInt(strArr[0]);
        
        for(int i = 1; i < strArr.length; i++){
            if(i % 2 != 0){
                if(strArr[i].equals("+")){
                    answer += Integer.parseInt(strArr[i+1]);
                    } else if (strArr[i].equals("-")){
                        answer -= Integer.parseInt(strArr[i+1]);
                    }
                }
            }
        
        return answer;
    }
}