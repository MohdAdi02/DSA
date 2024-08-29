import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BST {

    Node root;

    public static class Node {
        int key;
        Node lChild;
        Node rChild;

        public Node(int key) {
            this.key = key;
            this.lChild = null;
            this.rChild = null;
        }
    }

    public void insertion(int key) {

        Node newNode = new Node(key);

        if (root == null) {
            root = newNode;
            return;
        }
        Node currentNode = root;
        while (true) {
            if (key < currentNode.key) {
                if (currentNode.lChild == null) {
                    currentNode.lChild = newNode;
                    return;
                } else {
                    currentNode = currentNode.lChild ;
                }
            } else {
                if (currentNode.rChild == null) {
                    currentNode.rChild = newNode;
                    return;
                } else {
                    currentNode = currentNode.rChild;

                }
            }
        }
    }

    public void bfs(Node root) {
        Queue<Node> queue = new LinkedList<>();
        if (root == null) {
            return;
        }
        queue.add(root);
        while (!queue.isEmpty()) {
            Node node = queue.poll();
            System.out.print(node.key+" ");
            if (node.lChild != null) {
                queue.add(node.lChild);
            }
            if (node.rChild != null) {
                queue.add(node.rChild);
            }
        }
    }
    void dfs(Node root){
        Stack<Node> stack =new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            Node node = stack.pop();
            System.out.print(node.key+" ");

            if(node.rChild != null){
                stack.push(node.rChild);
            }
            if (node.lChild != null){
                stack.push(node.lChild);
            }
        }
    }

    void inorderTraversal(Node node) {
        if (node != null) {
            inorderTraversal(node.lChild);
            System.out.print(node.key + " ");
            inorderTraversal(node.rChild);

        }
    }

    public static void main(String[] args) {
        BST bst = new BST();

        bst.insertion(50);
        bst.insertion(30);
        bst.insertion(20);
        bst.insertion(40);
        bst.insertion(70);
        bst.insertion(60);
        bst.insertion(80);

        System.out.println("Inorder Traversal: ");
        bst.inorderTraversal(bst.root);
        System.out.println();


        System.out.println("Breadth First Traversal: ");
        bst.bfs(bst.root);
        System.out.println();

        System.out.println("Depth First Traversal: ");
        bst.dfs(bst.root);
    }
}






