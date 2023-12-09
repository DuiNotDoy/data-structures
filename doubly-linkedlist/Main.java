public class Main {
    public static void main(String[] args) {
        MyLinkedlist l = new MyLinkedlist();
        l.push(1);
        l.push(2);
        l.push(6);
        System.out.println("printing from head to tail");
        l.printForward();
        System.out.println("printing from tail to head");
        l.printBackward();
        int len = l.length;
        System.out.println("length: " + len);
        l.pop();
        l.printForward();
        l.printBackward();
        len = l.length;
        System.out.println("length: " + len);
    }
}

class Node {
    int data;
    Node next;
    Node prev;

    public Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class MyLinkedlist {
    private Node head, tail;
    public int length;

    public MyLinkedlist() {
        head = null;
        tail = null;
        length = 0;
    }

    public MyLinkedlist push(int data) {
        length++;

        if (head == null) {
            head = new Node(data);
            tail = head;
            return this;
        }

        Node node = new Node(data);
        node.next = head;
        head.prev = node;
        head = node;

        if (node.next.next == null) {
            tail.prev = node;
        }

        return this;
    }

    public int pop() {
        length--;

        if (head == null) {
            System.out.println("Linkedlist is empty!");
            return -1;
        }

        Node node = head;
        head = head.next;
        head.prev = null;
        return node.data;
    }

    public void printForward() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("end");
    }

    public void printBackward() {
        Node curr = tail;

        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.prev;
        }
        System.out.println("start");
    }
}
