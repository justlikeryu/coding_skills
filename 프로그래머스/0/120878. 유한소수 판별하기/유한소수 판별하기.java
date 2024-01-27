class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        int gcd = gcd(a, b);
        int numerator = a / gcd;
        int denominator = b / gcd;
        
        while(denominator != 1){
            if(denominator % 2 == 0){
                denominator /= 2;
            } else if (denominator % 5 ==0){
                denominator /= 5;
            } else {
                answer = 2;
                break;
            }
        }
        
        if(denominator == 1){
            answer = 1;
        }
        
        return answer;
    }
    //최대공약수
    public int gcd(int a, int b){
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}