import java.util.*;

class Solution {
    HashSet<Integer> set = new HashSet<>();
    public int solution(String numbers) {
        int answer = 0;
        
        recursive("", numbers);
        
        Iterator<Integer> it = set.iterator();
        
        while (it.hasNext()) {
            int number = it.next();
            
            if (isPrime(number)) answer++;
        }
        
        
        return answer;
    }
    
    public boolean isPrime(int num) {
        if (num < 2) return false;
        
        for (int i = 2; i <= (int) Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        
        return true;
    }
    
    public void recursive(String comb, String others) {
        if (!comb.equals(""))
            set.add(Integer.valueOf(comb));

        for (int i = 0; i < others.length(); i++)
            recursive(comb + others.charAt(i), others.substring(0, i) + others.substring(i + 1));
    }
}