class Solution {
    public int solution(int n) {
        int answer = 0;
        int x = 6;
        
        int gcd = gcd(n, x);//최대공약수
        int lcm = lcm(n, x);//최소공배수
        
        answer = lcm / 6;
        
        return answer;
    }
    
    public static int gcd(int a, int b){
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    
    public static int lcm(int a, int b){
        return (a * b) / gcd(a, b);
    }
}