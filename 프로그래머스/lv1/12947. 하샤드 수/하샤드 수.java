class Solution {
    public boolean solution(int x) {
        String[] str = String.valueOf(x).split("");
        
        int num = 0;
        
        for (String s : str) {
            num += Integer.valueOf(s);
        }
        
        return x % num == 0 ? true : false;
    }
}