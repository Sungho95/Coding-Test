class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int divisors = 0;
        
        for (int i = 1; i <= number; i++) {
            divisors = divisorsCount(i);
            if (divisors > limit) {
                answer += power;
            } else {
                answer += divisors;
            }
        }
        
        return answer;
    }
    
    public static int divisorsCount(int num) {
        int count = 0;
        
        for (int i = 1; i <= (int)Math.sqrt(num); i++) {
            if (num % i == 0) {
                count++;
                if (num / i != i) {
                    count++;
                }
            }
        }
        
        return count;
    }
}