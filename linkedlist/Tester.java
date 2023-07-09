public class Tester {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        System.out.println("insert front");
        list.insertFront(1);
        list.insertFront(4);
        list.printList();
        System.out.println("insert end");
        list.insertEnd(2);
        list.insertEnd(7);
        list.printList();
        System.out.println("insert at");
        list.insertAt(3, 10);
        list.printList();
    }
}
