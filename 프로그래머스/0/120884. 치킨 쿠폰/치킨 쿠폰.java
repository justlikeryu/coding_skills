class Solution {
    public int solution(int chicken) {
        int answer = -1;
        int coupon = 0;
        
        while(chicken >= 10){
            coupon += chicken / 10;
            chicken = chicken % 10 + chicken / 10;
        }
        
        answer = coupon;
        return answer;
    }
}