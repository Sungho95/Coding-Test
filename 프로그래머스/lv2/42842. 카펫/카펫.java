class Solution {
    public int[] solution(int brown, int red) {
        for(int i=1; i<=red; i++) {
            if(red%i==0 && (red/i+i)*2+4==brown) {
                return new int[] {red/i+2, i+2};
            }
        }
        return null;
    }
//     public int[] solution(int brown, int yellow) {
//         int[] answer = new int[2];
//         int sum = brown + yellow;

//         for (int i = 3; i < sum; i++) {
//             int row = i;
//             int col = sum / row;
            
//             if (row > col) continue;
            
//             if ((row - 2) * (col - 2) == yellow) {
//                 answer[0] = col;
//                 answer[1] = row;
                
//                 return answer;
//             } 
//         }
    
//         return answer;
//     }
}