import java.util.Stack;

class Solution {
    boolean solution(String s) {
        // stack 선언
        Stack<Character> stack = new Stack<>();

        // String 순회
        for (int i = 0; i < s.length(); i++) {
            // 스택이 비어있지 않으면서 i번째 문자가 ) 이면 스택에서 값 빼기
            if (!stack.empty() && s.charAt(i) == ')') {
                stack.pop();
            // 이 외의 경우 스택에 담기
            } else {
                stack.push(s.charAt(i));
            }
        }

        return stack.isEmpty();
    }
}