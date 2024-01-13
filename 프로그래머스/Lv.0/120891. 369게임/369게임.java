class Solution {
    public int solution(int order) {
        int answer = 0;
        
        String orderStr = Integer.toString(order);
        String[] strArr = orderStr.split("");
        
        int count = 0;
        for(int i = 0; i < strArr.length; i++){
            if(Integer.parseInt(strArr[i]) % 3 == 0 && Integer.parseInt(strArr[i]) != 0){
                count++;
            }
        }
        
        answer = count;
        return answer;
    }
}