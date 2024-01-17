class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        my_string = my_string.replaceAll("[^\\d]", " ");
        String[] strArr = my_string.split(" ");
        for (int i = 0; i < strArr.length; i++) {
            answer += (!strArr[i].isEmpty()) ? Integer.parseInt(strArr[i]) : 0;
        }
        
        return answer;
    }
}