import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args) {
        linkedList list = new linkedList();
        list.insertFront(1);
        list.insertFront(4);
        list.insertEnd(2);
        list.insertEnd(7);
        list.printList();
        list.removeEnd();
        list.printList();
        list.removeFront();
        list.printList();
    }
}

class linkedList {
    Node head;

    public linkedList() {
        this.head = null;
    }

    public linkedList insertFront(int n) {
        Node node = new Node(n);

        if (this.head == null) {
            this.head = node;
        } else {
            node.next = this.head;
            this.head = node;
        }

        return this;
    }

    public linkedList insertEnd(int n) {
        Node node = new Node(n);

        if (this.head == null) {
            this.head = node;
        } else {
            Node curr = this.head;

            while (curr.next != null) {
                curr = curr.next;
            }

            curr.next = node;
        }

        return this;
    }

    public linkedList removeFront() {
        if (this.head == null) {
            throw new NoSuchElementException("Given LinkedList is empty");
        } else {
            this.head = this.head.next;
        }

        return this;
    }

    public linkedList removeEnd() {
        if (this.head == null) {
            throw new NoSuchElementException("Given LinkedList is empty");
        } else {
            Node curr = this.head;
            Node prev = null;

            while (curr.next != null) {
                prev = curr;
                curr = curr.next;
            }

            prev.next = null;
        }

        return this;
    }

    public void printList() {
        if (this.head == null) {
            System.out.println("List is empty");
        } else {
            Node curr = this.head;

            while (true) {
                System.out.print(curr.value + " -> ");
                if (curr.next == null) {
                    System.out.println("null");
                    break;
                } else {
                    curr = curr.next;
                }
            }
        }
    }

    public void printList(linkedList list) {
        if (this.head == null) {
            System.out.println("List is empty");
        } else {
            Node curr = list.head;

            while (curr.next != null) {
                System.out.print(curr.value + " -> ");
                curr = curr.next;
            }
        }
    }
}

class Node {
    int value;
    Node next;

    public Node(int v) {
        this.value = v;
        this.next = null;
    }
}
