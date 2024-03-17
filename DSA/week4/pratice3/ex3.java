package DSA.week4.pratice3;

import java.util.Stack;

public class ex3 {
    public static void main(String[] args) {

        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println(stack);

        deleteMid(stack,5);
        System.out.println(stack);

        System.out.println();

        Stack stack1 = new Stack();
        stack1.push(10);
        stack1.push(20);
        stack1.push(30);
        stack1.push(40);

        System.out.println(stack1);

        deleteMid(stack1,4);
        System.out.println(stack1);

    }

    public static void deleteMid(Stack<Integer> s, int sizeOfStack){
        // code here
     int mid = sizeOfStack / 2;
     Stack<Integer> stack = new Stack<Integer>();
        for (int i = 0; i <= mid; i++) {
            stack.push(s.pop());
        }
        stack.pop();
        while (!stack.isEmpty()){
            s.push(stack.pop());
        }
    }
}
