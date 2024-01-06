import java.util.ArrayList;

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

        // visitChild(node1);
        //
        // int total = computeSum(node1);
        // System.out.println("total: " + total);

        breadthFirstTraversal(node1);
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

    static int computeSum(Node node) {
        if (node.left != null) {
            node.data += computeSum(node.left);
        }

        if (node.right != null) {
            node.data += computeSum(node.right);
        }

        return node.data;
    }

    static void breadthFirstTraversal(Node node) {
        ArrayList<Node> to_visit = new ArrayList<Node>();
        to_visit.add(node);

        while (to_visit.size() > 0) {
            Node curr = to_visit.getFirst();
            System.out.println("curr node: " + curr.data);

            if (curr.left != null)
                to_visit.add(curr.left);

            if (curr.right != null)
                to_visit.add(curr.right);

            to_visit.removeFirst();
        }
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
