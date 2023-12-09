public class Main {
    public static void main(String[] args) {
        MyStack s = new MyStack();
        s.push(1);
        s.peek();
        s.push(2);
        s.peek();
        s.push(3);
        s.peek();
        s.pop();
        s.peek();
    }
}

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class MyStack {
    Node top;

    public MyStack() {
        top = null;
    }

    public int peek() {
        if (top == null) {
            System.out.println("MyStack is empty!");
            return -1;
        }

        System.out.println(top.data);
        return top.data;
    }

    public int pop() {
        if (top == null) {
            System.out.println("MyStack is empty!");
            return -1;
        }

        Node node = top;
        top = top.next;

        return node.data;
    }

    public MyStack push(int data) {
        if (top == null) {
            top = new Node(data);
            return this;
        }

        Node node = new Node(data);
        node.next = top;
        top = node;

        return this;
    }
}
