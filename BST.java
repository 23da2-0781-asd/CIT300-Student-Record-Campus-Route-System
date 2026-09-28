class BSTNode {
    Student student;
    BSTNode left, right;

    public BSTNode(Student student) {
        this.student = student;
    }
}

public class BST {

    BSTNode root;

    public BSTNode insert(BSTNode root, Student student) {
        if (root == null) {
            return new BSTNode(student);
        }

        if (student.id < root.student.id) {
            root.left = insert(root.left, student);
        } else {
            root.right = insert(root.right, student);
        }

        return root;
    }

    public void add(Student student) {
        root = insert(root, student);
    }

    public void inorder(BSTNode root) {
        if (root != null) {
            inorder(root.left);
            System.out.println(root.student);
            inorder(root.right);
        }
    }

    public void display() {
        inorder(root);
    }
}