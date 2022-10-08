class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        for (int i = 0; i < n; i++) {
            String str1 = "";
            String str2 = "";
            while(arr1[i] != 0) {
                str1 = arr1[i] % 2 + str1;
                arr1[i] /= 2;
            }
            while(arr2[i] != 0) {
                str2 = arr2[i] % 2 + str2;
                arr2[i] /= 2;
            }
            
            while (str1.length() != n) str1 = "0" + str1;
            while (str2.length() != n) str2 = "0" + str2;
            
            String resultStr = "";
            for (int j = 0; j < n; j++) {
                if (str1.charAt(j) == '0' && str2.charAt(j) == '0') {
                    resultStr += " ";
                } else {
                    resultStr += "#";
                }
            }
            
            answer[i] = resultStr;
        }
        return answer;
    }
}