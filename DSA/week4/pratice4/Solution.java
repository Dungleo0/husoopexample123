package DSA.week4.pratice4;

import java.util.Stack;

class Solution {

    public static void main(String[] args) {


        System.out.println(isValid("()"));
        System.out.println(isValid("()[]{}"));
        System.out.println(isValid("(]"));
    }
    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        for (int i =0; i < s.length();i++){
            char c = s.charAt(i);
            if(c == '(' || c == '{' || c == '['){
                st.push(c);
            }else{
                char peekchar = st.peek();
                if(c == ')' && peekchar == '('
                        || c == '}' && peekchar == '{'
                        || c == ']' && peekchar == '['){
                    st.pop();
                }else{
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}
