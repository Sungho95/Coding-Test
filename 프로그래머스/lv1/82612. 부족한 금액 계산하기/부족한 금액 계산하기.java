// class Solution {
//     public long solution(long price, long money, int count) {        
//         return Math.max(price * (count * (count + 1) / 2) - money, 0);
//     }
// }

class Solution {
    public long solution(int price, int money, int count) {        
        long nPrice = 0;
        
        for (int i = 1; i <= count; i++) {
            nPrice += i * price;
        }
        
        return nPrice - money >= 0 ? nPrice - money : 0;
    }
}