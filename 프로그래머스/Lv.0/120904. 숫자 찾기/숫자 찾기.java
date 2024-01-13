class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        
        String intStr = Integer.toString(num);
        String[] strArr = intStr.split("");
        for(int i = 0; i < intStr.length(); i++){
            if(strArr[i].equals(Integer.toString(k))){
                return answer = i + 1;
            }
        }
        answer = -1;
        
        return answer;
    }
}