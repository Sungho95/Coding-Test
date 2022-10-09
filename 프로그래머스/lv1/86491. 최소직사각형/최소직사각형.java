class Solution {
    public int solution(int[][] sizes) {
        
        int longLen = 0;
        int shortLen = 0;
        for (int i = 0; i < sizes.length; i++) {
            int w = sizes[i][0];
            int h = sizes[i][1];
            if (w > h) {
                longLen = longLen < w ? w : longLen;
                shortLen = shortLen < h ? h : shortLen;
            } else {
                longLen = longLen < h ? h : longLen;
                shortLen = shortLen < w ? w : shortLen;
            }
        }
        return longLen * shortLen;
    }
}