package DSA.week4.pratice2;

//{ Driver Code Starts

import java.io.*;
import java.lang.*;

public class ArrayStack {

    public static void main(String args[]) throws IOException {
// 		 Scanner sc = new Scanner(System.in);
// 		 int t=sc.nextInt();
        StackArray s = new StackArray();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        System.out.println("top stack is: "+s.top);
        System.out.println("element ");
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());


    }
}


// } Driver Code Ends


class StackArray {
    int top;
    int arr[] = new int[1000];

    StackArray() {
        top = -1;
    }

    //Function to push an integer into the stack.
    void push(int a) {

        arr[++top] = a;


        // Your code here
    }

    boolean isEmpty() {
        return top < 0;
    }

    //Function to remove an item from top of the stack.
    int pop() {
        if (!isEmpty()) {
            int data = arr[top];
            arr[top] = -1;
            top--;
            return data;
        }

        return Integer.MIN_VALUE;
        // Your code here
    }
}
