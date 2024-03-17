package DSA.week4.pratice2;

import java.util.*;

//{ Driver Code Starts

class StackNode {
    int data;
    StackNode next;

    StackNode(int a) {
        data = a;
        next = null;
    }
}

class GfG {

    public static void main(String args[]) {

        MyStack stack = new MyStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}

// } Driver Code Ends


class MyStack {
    // class StackNode {
    //     int data;
    //     StackNode next;
    //     StackNode(int a) {
    //         data = a;
    //         next = null;
    //     }
    // }
    StackNode top;

    //Function to push an integer into the stack.
    void push(int a) {
        StackNode cur = new StackNode(a);
        cur.next = top;
        top = cur;
        // Add your code here
    }


    //Function to remove an item from top of the stack.
    int pop() {
        if (top == null) {
            return -1;
        }
        int data = top.data;
        top = top.next;
        return data;
        // Add your code here
    }

}
