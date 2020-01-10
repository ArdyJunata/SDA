package LatihanTree;

public class Tree {

    private Node root;
    private int jumlah;

    public Tree() {
        root = null;
    }

    public void insert(String s) {
        Convert c = new Convert(s);
        s = c.inToPost();
        Stck1 stk = new Stck1(s.length());
        s = s + "#";
        int i = 0;
        char symbol = s.charAt(i);
        Node newNode;
        while (symbol != '#') {
            if (symbol >= '0' && symbol <= '9' || symbol >= 'A'
                    && symbol <= 'Z' || symbol >= 'a' && symbol <= 'z') {
                newNode = new Node(symbol);
                stk.push(newNode);
            } else if (symbol == '+' || symbol == '-' || symbol == '/'
                    || symbol == '*') {
                Node ptr1 = stk.pop();
                Node ptr2 = stk.pop();
                newNode = new Node(symbol);
                newNode.leftChild = ptr2;
                newNode.rightChild = ptr1;
                stk.push(newNode);
            }
            symbol = s.charAt(++i);
        }
        root = stk.pop();
    }

    public void traverse(String type) {
        switch (type) {
            case "pre":
                System.out.print("Prefix:-    ");
                preOrder(root);
                break;
            case "in":
                System.out.print("Infix :-     ");
                inOrder(root);
                break;
            case "post":
                System.out.print("Postfix :-   ");
                postOrder(root);
                break;
            case "jumlah":
                System.out.println("Calculate :- " + jumlahNilai(root));
            default:
                System.out.println("Invalid Choice");
        }
    }

    private int jumlahNilai(Node localRoot) {
        if (localRoot != null) {
            if (localRoot.data == '+') {
                return (jumlahNilai(localRoot.leftChild) + jumlahNilai(localRoot.rightChild));
            } else if (localRoot.data == '-') {
                return (jumlahNilai(localRoot.leftChild) - jumlahNilai(localRoot.rightChild));
            } else if (localRoot.data == '*') {
                return (jumlahNilai(localRoot.leftChild) * jumlahNilai(localRoot.rightChild));
            } else if (localRoot.data == '/') {
                return (jumlahNilai(localRoot.leftChild) / jumlahNilai(localRoot.rightChild));
            } else {
                return (Integer.parseInt(localRoot.data + ""));
            }
        }
        return 0;
    }

    public int getJumlah() {
        return jumlah;
    }

    private void preOrder(Node localRoot) {
        if (localRoot != null) {
            localRoot.displayNode();
            preOrder(localRoot.leftChild);
            preOrder(localRoot.rightChild);
        }
    }

    private void inOrder(Node localRoot) {
        if (localRoot != null) {
            inOrder(localRoot.leftChild);
            localRoot.displayNode();
            inOrder(localRoot.rightChild);
        }
    }

    private void postOrder(Node localRoot) {
        if (localRoot != null) {
            postOrder(localRoot.leftChild);
            postOrder(localRoot.rightChild);
            localRoot.displayNode();
        }
    }
}
