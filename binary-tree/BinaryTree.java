public class BinaryTree {
    public static void main(String[] args) {
        Node node1 = new Node(2);
        Node node2 = new Node(3);
        Node node3 = new Node(4);
        Node node4 = new Node(5);
        Node node5 = new Node(6);

        node1.left = node2;
        node1.right = node3;

        node2.left = node4;
        node2.right = node5;

        visitChild(node1);
    }

    static Node visitChild(Node node) {
        System.out.println("node: " + node.data);
        if (node.left != null) {
            visitChild(node.left);
        }

        if (node.right != null) {
            visitChild(node.right);
        }

        return node;
    }
}

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
