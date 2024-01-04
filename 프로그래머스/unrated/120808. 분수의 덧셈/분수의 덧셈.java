class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        
        answer[0] = (numer1 * denom2) + (numer2 * denom1);
        answer[1] = (denom1 * denom2);
        
        int gcdValue = gcd(answer[0], answer[1]);
        answer[0] /= gcdValue;
        answer[1] /= gcdValue;
        return answer;
    }
    
            private int gcd(int a, int b){
            while (b != 0){
                int temp = b;
                b = a % b;
                a = temp;
            }
            return Math.abs(a);
        }
}