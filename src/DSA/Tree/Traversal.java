package DSA.Tree;

public class Traversal {

    public static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    public void preOrder(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.data + ", ");

        preOrder(node.left);
        preOrder(node.right);
    }

    public void postOrder(Node node) {
        if (node == null) {
            return;
        }
        postOrder(node.left);
        postOrder(node.right);

        System.out.print(node.data + ", ");
    }

    public void inOrder(Node node) {
        if (node == null) {
            return;
        }
        inOrder(node.left);

        System.out.print(node.data + ", ");

        inOrder(node.right);
    }

    public static void main(String[] args) {
        Node node = new Node(1);
        node.left = new Node(2);
        node.right = new Node(3);
        node.left.left = new Node(4);
        node.left.left.left = new Node(5);

        Traversal traversal = new Traversal();

        traversal.preOrder(node);
        System.out.println();
        traversal.postOrder(node);
        System.out.println();
        traversal.inOrder(node);
    }
}
