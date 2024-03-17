package DSA.week4.pratice1;

import java.util.Scanner;
import java.util.Stack;

public class Solution {

    public static void main(String[] args) {
        String s = "aaabbcdddd"; // st.push(s.charAt(i));
        Stack<Character> st = new Stack<>();
        String result = "";
        st.push(s.charAt(0));
        int count = 1;
        for (int i = 1; i < s.length(); i++) {
            if(st.peek() == s.charAt(i)){
                count++;
            }else {
                result += st.pop() +"" +count;
                st.push(s.charAt(i));
                count=1;
            }
        }
        result+=st.pop() +"" +count;
        System.out.println(result);
    }
}

/*
* String ans = "";
        st.push(s.charAt(0));
        int count = 1;
        for (int i = 1; i < s.length(); i++) {
            if (st.peek() == s.charAt(i)) {
                count++;
            } else {
                ans += st.pop()+ "" + count;
                st.push(s.charAt(i));
                count = 1;
            }
        }
        ans += st.pop()+ "" + count;
        System.out.println(ans);
* */