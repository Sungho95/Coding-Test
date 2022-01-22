lass Solution {
    public int solution(String s) {

        int answer = 0;
        String en_num[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for(int i = 0; i < en_num.length; i++){
            s = s.replace(en_num[i], Integer.toString(i));
        }

        answer = Integer.parseInt(s);;

        return answer;
    }
}
