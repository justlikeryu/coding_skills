import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        List<Integer> prime = new ArrayList<>();
        
        for(int i = 2; i <= n; i++){
            while(n % i == 0){
                if(!prime.contains(i)){
                    prime.add(i);
                }
                n /= i;
            }
        }
        
        answer = new int[prime.size()];
        for(int j = 0; j < prime.size(); j++){
            answer[j] = prime.get(j);
        }
        
        return answer;
    }
}