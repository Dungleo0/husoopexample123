package DSA.week4.ex1;


public class Main {

    public static void main(String[] args) {

        MyStack<Character> s = new MyStack<>();

        String hoten = "hoten";

        for (int i = 0; i < hoten.length(); i++) {
            if(i % 2 == 0) {
                s.push(hoten.charAt(i)); // h t n
            }
            if( i % 3 == 0){
                s.pop();
            }
        }

        s.printList();
    }
}
